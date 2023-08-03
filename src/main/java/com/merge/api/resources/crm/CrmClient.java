package com.merge.api.resources.crm;

import com.merge.api.core.ClientOptions;
import com.merge.api.core.Suppliers;
import com.merge.api.resources.crm.accountdetails.AccountDetailsClient;
import com.merge.api.resources.crm.accounts.AccountsClient;
import com.merge.api.resources.crm.accounttoken.AccountTokenClient;
import com.merge.api.resources.crm.associations.AssociationsClient;
import com.merge.api.resources.crm.associationtypes.AssociationTypesClient;
import com.merge.api.resources.crm.availableactions.AvailableActionsClient;
import com.merge.api.resources.crm.contacts.ContactsClient;
import com.merge.api.resources.crm.customobjectclasses.CustomObjectClassesClient;
import com.merge.api.resources.crm.customobjects.CustomObjectsClient;
import com.merge.api.resources.crm.deleteaccount.DeleteAccountClient;
import com.merge.api.resources.crm.engagements.EngagementsClient;
import com.merge.api.resources.crm.engagementtypes.EngagementTypesClient;
import com.merge.api.resources.crm.forceresync.ForceResyncClient;
import com.merge.api.resources.crm.generatekey.GenerateKeyClient;
import com.merge.api.resources.crm.issues.IssuesClient;
import com.merge.api.resources.crm.leads.LeadsClient;
import com.merge.api.resources.crm.linkedaccounts.LinkedAccountsClient;
import com.merge.api.resources.crm.linktoken.LinkTokenClient;
import com.merge.api.resources.crm.notes.NotesClient;
import com.merge.api.resources.crm.opportunities.OpportunitiesClient;
import com.merge.api.resources.crm.passthrough.PassthroughClient;
import com.merge.api.resources.crm.regeneratekey.RegenerateKeyClient;
import com.merge.api.resources.crm.selectivesync.SelectiveSyncClient;
import com.merge.api.resources.crm.stages.StagesClient;
import com.merge.api.resources.crm.syncstatus.SyncStatusClient;
import com.merge.api.resources.crm.tasks.TasksClient;
import com.merge.api.resources.crm.users.UsersClient;
import com.merge.api.resources.crm.webhookreceivers.WebhookReceiversClient;
import java.util.function.Supplier;

public class CrmClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<AccountDetailsClient> accountDetailsClient;

    protected final Supplier<AccountTokenClient> accountTokenClient;

    protected final Supplier<AccountsClient> accountsClient;

    protected final Supplier<AvailableActionsClient> availableActionsClient;

    protected final Supplier<ContactsClient> contactsClient;

    protected final Supplier<CustomObjectClassesClient> customObjectClassesClient;

    protected final Supplier<AssociationTypesClient> associationTypesClient;

    protected final Supplier<CustomObjectsClient> customObjectsClient;

    protected final Supplier<AssociationsClient> associationsClient;

    protected final Supplier<DeleteAccountClient> deleteAccountClient;

    protected final Supplier<EngagementTypesClient> engagementTypesClient;

    protected final Supplier<EngagementsClient> engagementsClient;

    protected final Supplier<GenerateKeyClient> generateKeyClient;

    protected final Supplier<IssuesClient> issuesClient;

    protected final Supplier<LeadsClient> leadsClient;

    protected final Supplier<LinkTokenClient> linkTokenClient;

    protected final Supplier<LinkedAccountsClient> linkedAccountsClient;

    protected final Supplier<NotesClient> notesClient;

    protected final Supplier<OpportunitiesClient> opportunitiesClient;

    protected final Supplier<PassthroughClient> passthroughClient;

    protected final Supplier<RegenerateKeyClient> regenerateKeyClient;

    protected final Supplier<SelectiveSyncClient> selectiveSyncClient;

    protected final Supplier<StagesClient> stagesClient;

    protected final Supplier<SyncStatusClient> syncStatusClient;

    protected final Supplier<ForceResyncClient> forceResyncClient;

    protected final Supplier<TasksClient> tasksClient;

    protected final Supplier<UsersClient> usersClient;

    protected final Supplier<WebhookReceiversClient> webhookReceiversClient;

    public CrmClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.accountDetailsClient = Suppliers.memoize(() -> new AccountDetailsClient(clientOptions));
        this.accountTokenClient = Suppliers.memoize(() -> new AccountTokenClient(clientOptions));
        this.accountsClient = Suppliers.memoize(() -> new AccountsClient(clientOptions));
        this.availableActionsClient = Suppliers.memoize(() -> new AvailableActionsClient(clientOptions));
        this.contactsClient = Suppliers.memoize(() -> new ContactsClient(clientOptions));
        this.customObjectClassesClient = Suppliers.memoize(() -> new CustomObjectClassesClient(clientOptions));
        this.associationTypesClient = Suppliers.memoize(() -> new AssociationTypesClient(clientOptions));
        this.customObjectsClient = Suppliers.memoize(() -> new CustomObjectsClient(clientOptions));
        this.associationsClient = Suppliers.memoize(() -> new AssociationsClient(clientOptions));
        this.deleteAccountClient = Suppliers.memoize(() -> new DeleteAccountClient(clientOptions));
        this.engagementTypesClient = Suppliers.memoize(() -> new EngagementTypesClient(clientOptions));
        this.engagementsClient = Suppliers.memoize(() -> new EngagementsClient(clientOptions));
        this.generateKeyClient = Suppliers.memoize(() -> new GenerateKeyClient(clientOptions));
        this.issuesClient = Suppliers.memoize(() -> new IssuesClient(clientOptions));
        this.leadsClient = Suppliers.memoize(() -> new LeadsClient(clientOptions));
        this.linkTokenClient = Suppliers.memoize(() -> new LinkTokenClient(clientOptions));
        this.linkedAccountsClient = Suppliers.memoize(() -> new LinkedAccountsClient(clientOptions));
        this.notesClient = Suppliers.memoize(() -> new NotesClient(clientOptions));
        this.opportunitiesClient = Suppliers.memoize(() -> new OpportunitiesClient(clientOptions));
        this.passthroughClient = Suppliers.memoize(() -> new PassthroughClient(clientOptions));
        this.regenerateKeyClient = Suppliers.memoize(() -> new RegenerateKeyClient(clientOptions));
        this.selectiveSyncClient = Suppliers.memoize(() -> new SelectiveSyncClient(clientOptions));
        this.stagesClient = Suppliers.memoize(() -> new StagesClient(clientOptions));
        this.syncStatusClient = Suppliers.memoize(() -> new SyncStatusClient(clientOptions));
        this.forceResyncClient = Suppliers.memoize(() -> new ForceResyncClient(clientOptions));
        this.tasksClient = Suppliers.memoize(() -> new TasksClient(clientOptions));
        this.usersClient = Suppliers.memoize(() -> new UsersClient(clientOptions));
        this.webhookReceiversClient = Suppliers.memoize(() -> new WebhookReceiversClient(clientOptions));
    }

    public AccountDetailsClient accountDetails() {
        return this.accountDetailsClient.get();
    }

    public AccountTokenClient accountToken() {
        return this.accountTokenClient.get();
    }

    public AccountsClient accounts() {
        return this.accountsClient.get();
    }

    public AvailableActionsClient availableActions() {
        return this.availableActionsClient.get();
    }

    public ContactsClient contacts() {
        return this.contactsClient.get();
    }

    public CustomObjectClassesClient customObjectClasses() {
        return this.customObjectClassesClient.get();
    }

    public AssociationTypesClient associationTypes() {
        return this.associationTypesClient.get();
    }

    public CustomObjectsClient customObjects() {
        return this.customObjectsClient.get();
    }

    public AssociationsClient associations() {
        return this.associationsClient.get();
    }

    public DeleteAccountClient deleteAccount() {
        return this.deleteAccountClient.get();
    }

    public EngagementTypesClient engagementTypes() {
        return this.engagementTypesClient.get();
    }

    public EngagementsClient engagements() {
        return this.engagementsClient.get();
    }

    public GenerateKeyClient generateKey() {
        return this.generateKeyClient.get();
    }

    public IssuesClient issues() {
        return this.issuesClient.get();
    }

    public LeadsClient leads() {
        return this.leadsClient.get();
    }

    public LinkTokenClient linkToken() {
        return this.linkTokenClient.get();
    }

    public LinkedAccountsClient linkedAccounts() {
        return this.linkedAccountsClient.get();
    }

    public NotesClient notes() {
        return this.notesClient.get();
    }

    public OpportunitiesClient opportunities() {
        return this.opportunitiesClient.get();
    }

    public PassthroughClient passthrough() {
        return this.passthroughClient.get();
    }

    public RegenerateKeyClient regenerateKey() {
        return this.regenerateKeyClient.get();
    }

    public SelectiveSyncClient selectiveSync() {
        return this.selectiveSyncClient.get();
    }

    public StagesClient stages() {
        return this.stagesClient.get();
    }

    public SyncStatusClient syncStatus() {
        return this.syncStatusClient.get();
    }

    public ForceResyncClient forceResync() {
        return this.forceResyncClient.get();
    }

    public TasksClient tasks() {
        return this.tasksClient.get();
    }

    public UsersClient users() {
        return this.usersClient.get();
    }

    public WebhookReceiversClient webhookReceivers() {
        return this.webhookReceiversClient.get();
    }
}
