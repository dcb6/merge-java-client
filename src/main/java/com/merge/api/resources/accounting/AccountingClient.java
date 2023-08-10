package com.merge.api.resources.accounting;

import com.merge.api.core.ClientOptions;
import com.merge.api.core.Suppliers;
import com.merge.api.resources.accounting.accountdetails.AccountDetailsClient;
import com.merge.api.resources.accounting.accounts.AccountsClient;
import com.merge.api.resources.accounting.accounttoken.AccountTokenClient;
import com.merge.api.resources.accounting.addresses.AddressesClient;
import com.merge.api.resources.accounting.asyncpassthrough.AsyncPassthroughClient;
import com.merge.api.resources.accounting.attachments.AttachmentsClient;
import com.merge.api.resources.accounting.availableactions.AvailableActionsClient;
import com.merge.api.resources.accounting.balancesheets.BalanceSheetsClient;
import com.merge.api.resources.accounting.cashflowstatements.CashFlowStatementsClient;
import com.merge.api.resources.accounting.companyinfo.CompanyInfoClient;
import com.merge.api.resources.accounting.contacts.ContactsClient;
import com.merge.api.resources.accounting.creditnotes.CreditNotesClient;
import com.merge.api.resources.accounting.deleteaccount.DeleteAccountClient;
import com.merge.api.resources.accounting.expenses.ExpensesClient;
import com.merge.api.resources.accounting.forceresync.ForceResyncClient;
import com.merge.api.resources.accounting.generatekey.GenerateKeyClient;
import com.merge.api.resources.accounting.incomestatements.IncomeStatementsClient;
import com.merge.api.resources.accounting.invoices.InvoicesClient;
import com.merge.api.resources.accounting.issues.IssuesClient;
import com.merge.api.resources.accounting.items.ItemsClient;
import com.merge.api.resources.accounting.journalentries.JournalEntriesClient;
import com.merge.api.resources.accounting.linkedaccounts.LinkedAccountsClient;
import com.merge.api.resources.accounting.linktoken.LinkTokenClient;
import com.merge.api.resources.accounting.passthrough.PassthroughClient;
import com.merge.api.resources.accounting.payments.PaymentsClient;
import com.merge.api.resources.accounting.phonenumbers.PhoneNumbersClient;
import com.merge.api.resources.accounting.purchaseorders.PurchaseOrdersClient;
import com.merge.api.resources.accounting.regeneratekey.RegenerateKeyClient;
import com.merge.api.resources.accounting.selectivesync.SelectiveSyncClient;
import com.merge.api.resources.accounting.syncstatus.SyncStatusClient;
import com.merge.api.resources.accounting.taxrates.TaxRatesClient;
import com.merge.api.resources.accounting.trackingcategories.TrackingCategoriesClient;
import com.merge.api.resources.accounting.transactions.TransactionsClient;
import com.merge.api.resources.accounting.vendorcredits.VendorCreditsClient;
import com.merge.api.resources.accounting.webhookreceivers.WebhookReceiversClient;
import java.util.function.Supplier;

public class AccountingClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<AccountDetailsClient> accountDetailsClient;

    protected final Supplier<AccountTokenClient> accountTokenClient;

    protected final Supplier<AccountsClient> accountsClient;

    protected final Supplier<AddressesClient> addressesClient;

    protected final Supplier<AsyncPassthroughClient> asyncPassthroughClient;

    protected final Supplier<AttachmentsClient> attachmentsClient;

    protected final Supplier<AvailableActionsClient> availableActionsClient;

    protected final Supplier<BalanceSheetsClient> balanceSheetsClient;

    protected final Supplier<CashFlowStatementsClient> cashFlowStatementsClient;

    protected final Supplier<CompanyInfoClient> companyInfoClient;

    protected final Supplier<ContactsClient> contactsClient;

    protected final Supplier<CreditNotesClient> creditNotesClient;

    protected final Supplier<DeleteAccountClient> deleteAccountClient;

    protected final Supplier<ExpensesClient> expensesClient;

    protected final Supplier<GenerateKeyClient> generateKeyClient;

    protected final Supplier<IncomeStatementsClient> incomeStatementsClient;

    protected final Supplier<InvoicesClient> invoicesClient;

    protected final Supplier<IssuesClient> issuesClient;

    protected final Supplier<ItemsClient> itemsClient;

    protected final Supplier<JournalEntriesClient> journalEntriesClient;

    protected final Supplier<LinkTokenClient> linkTokenClient;

    protected final Supplier<LinkedAccountsClient> linkedAccountsClient;

    protected final Supplier<PassthroughClient> passthroughClient;

    protected final Supplier<PaymentsClient> paymentsClient;

    protected final Supplier<PhoneNumbersClient> phoneNumbersClient;

    protected final Supplier<PurchaseOrdersClient> purchaseOrdersClient;

    protected final Supplier<RegenerateKeyClient> regenerateKeyClient;

    protected final Supplier<SelectiveSyncClient> selectiveSyncClient;

    protected final Supplier<SyncStatusClient> syncStatusClient;

    protected final Supplier<ForceResyncClient> forceResyncClient;

    protected final Supplier<TaxRatesClient> taxRatesClient;

    protected final Supplier<TrackingCategoriesClient> trackingCategoriesClient;

    protected final Supplier<TransactionsClient> transactionsClient;

    protected final Supplier<VendorCreditsClient> vendorCreditsClient;

    protected final Supplier<WebhookReceiversClient> webhookReceiversClient;

    public AccountingClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.accountDetailsClient = Suppliers.memoize(() -> new AccountDetailsClient(clientOptions));
        this.accountTokenClient = Suppliers.memoize(() -> new AccountTokenClient(clientOptions));
        this.accountsClient = Suppliers.memoize(() -> new AccountsClient(clientOptions));
        this.addressesClient = Suppliers.memoize(() -> new AddressesClient(clientOptions));
        this.asyncPassthroughClient = Suppliers.memoize(() -> new AsyncPassthroughClient(clientOptions));
        this.attachmentsClient = Suppliers.memoize(() -> new AttachmentsClient(clientOptions));
        this.availableActionsClient = Suppliers.memoize(() -> new AvailableActionsClient(clientOptions));
        this.balanceSheetsClient = Suppliers.memoize(() -> new BalanceSheetsClient(clientOptions));
        this.cashFlowStatementsClient = Suppliers.memoize(() -> new CashFlowStatementsClient(clientOptions));
        this.companyInfoClient = Suppliers.memoize(() -> new CompanyInfoClient(clientOptions));
        this.contactsClient = Suppliers.memoize(() -> new ContactsClient(clientOptions));
        this.creditNotesClient = Suppliers.memoize(() -> new CreditNotesClient(clientOptions));
        this.deleteAccountClient = Suppliers.memoize(() -> new DeleteAccountClient(clientOptions));
        this.expensesClient = Suppliers.memoize(() -> new ExpensesClient(clientOptions));
        this.generateKeyClient = Suppliers.memoize(() -> new GenerateKeyClient(clientOptions));
        this.incomeStatementsClient = Suppliers.memoize(() -> new IncomeStatementsClient(clientOptions));
        this.invoicesClient = Suppliers.memoize(() -> new InvoicesClient(clientOptions));
        this.issuesClient = Suppliers.memoize(() -> new IssuesClient(clientOptions));
        this.itemsClient = Suppliers.memoize(() -> new ItemsClient(clientOptions));
        this.journalEntriesClient = Suppliers.memoize(() -> new JournalEntriesClient(clientOptions));
        this.linkTokenClient = Suppliers.memoize(() -> new LinkTokenClient(clientOptions));
        this.linkedAccountsClient = Suppliers.memoize(() -> new LinkedAccountsClient(clientOptions));
        this.passthroughClient = Suppliers.memoize(() -> new PassthroughClient(clientOptions));
        this.paymentsClient = Suppliers.memoize(() -> new PaymentsClient(clientOptions));
        this.phoneNumbersClient = Suppliers.memoize(() -> new PhoneNumbersClient(clientOptions));
        this.purchaseOrdersClient = Suppliers.memoize(() -> new PurchaseOrdersClient(clientOptions));
        this.regenerateKeyClient = Suppliers.memoize(() -> new RegenerateKeyClient(clientOptions));
        this.selectiveSyncClient = Suppliers.memoize(() -> new SelectiveSyncClient(clientOptions));
        this.syncStatusClient = Suppliers.memoize(() -> new SyncStatusClient(clientOptions));
        this.forceResyncClient = Suppliers.memoize(() -> new ForceResyncClient(clientOptions));
        this.taxRatesClient = Suppliers.memoize(() -> new TaxRatesClient(clientOptions));
        this.trackingCategoriesClient = Suppliers.memoize(() -> new TrackingCategoriesClient(clientOptions));
        this.transactionsClient = Suppliers.memoize(() -> new TransactionsClient(clientOptions));
        this.vendorCreditsClient = Suppliers.memoize(() -> new VendorCreditsClient(clientOptions));
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

    public AddressesClient addresses() {
        return this.addressesClient.get();
    }

    public AsyncPassthroughClient asyncPassthrough() {
        return this.asyncPassthroughClient.get();
    }

    public AttachmentsClient attachments() {
        return this.attachmentsClient.get();
    }

    public AvailableActionsClient availableActions() {
        return this.availableActionsClient.get();
    }

    public BalanceSheetsClient balanceSheets() {
        return this.balanceSheetsClient.get();
    }

    public CashFlowStatementsClient cashFlowStatements() {
        return this.cashFlowStatementsClient.get();
    }

    public CompanyInfoClient companyInfo() {
        return this.companyInfoClient.get();
    }

    public ContactsClient contacts() {
        return this.contactsClient.get();
    }

    public CreditNotesClient creditNotes() {
        return this.creditNotesClient.get();
    }

    public DeleteAccountClient deleteAccount() {
        return this.deleteAccountClient.get();
    }

    public ExpensesClient expenses() {
        return this.expensesClient.get();
    }

    public GenerateKeyClient generateKey() {
        return this.generateKeyClient.get();
    }

    public IncomeStatementsClient incomeStatements() {
        return this.incomeStatementsClient.get();
    }

    public InvoicesClient invoices() {
        return this.invoicesClient.get();
    }

    public IssuesClient issues() {
        return this.issuesClient.get();
    }

    public ItemsClient items() {
        return this.itemsClient.get();
    }

    public JournalEntriesClient journalEntries() {
        return this.journalEntriesClient.get();
    }

    public LinkTokenClient linkToken() {
        return this.linkTokenClient.get();
    }

    public LinkedAccountsClient linkedAccounts() {
        return this.linkedAccountsClient.get();
    }

    public PassthroughClient passthrough() {
        return this.passthroughClient.get();
    }

    public PaymentsClient payments() {
        return this.paymentsClient.get();
    }

    public PhoneNumbersClient phoneNumbers() {
        return this.phoneNumbersClient.get();
    }

    public PurchaseOrdersClient purchaseOrders() {
        return this.purchaseOrdersClient.get();
    }

    public RegenerateKeyClient regenerateKey() {
        return this.regenerateKeyClient.get();
    }

    public SelectiveSyncClient selectiveSync() {
        return this.selectiveSyncClient.get();
    }

    public SyncStatusClient syncStatus() {
        return this.syncStatusClient.get();
    }

    public ForceResyncClient forceResync() {
        return this.forceResyncClient.get();
    }

    public TaxRatesClient taxRates() {
        return this.taxRatesClient.get();
    }

    public TrackingCategoriesClient trackingCategories() {
        return this.trackingCategoriesClient.get();
    }

    public TransactionsClient transactions() {
        return this.transactionsClient.get();
    }

    public VendorCreditsClient vendorCredits() {
        return this.vendorCreditsClient.get();
    }

    public WebhookReceiversClient webhookReceivers() {
        return this.webhookReceiversClient.get();
    }
}
