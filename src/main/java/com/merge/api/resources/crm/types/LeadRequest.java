package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LeadRequest.Builder.class)
public final class LeadRequest {
    private final Optional<LeadRequestOwner> owner;

    private final Optional<String> leadSource;

    private final Optional<String> title;

    private final Optional<String> company;

    private final Optional<String> firstName;

    private final Optional<String> lastName;

    private final Optional<List<AddressRequest>> addresses;

    private final Optional<List<EmailAddressRequest>> emailAddresses;

    private final Optional<List<PhoneNumberRequest>> phoneNumbers;

    private final Optional<OffsetDateTime> convertedDate;

    private final Optional<LeadRequestConvertedContact> convertedContact;

    private final Optional<LeadRequestConvertedAccount> convertedAccount;

    private final Optional<Map<String, JsonNode>> integrationParams;

    private final Optional<Map<String, JsonNode>> linkedAccountParams;

    private final Optional<List<RemoteFieldRequest>> remoteFields;

    private LeadRequest(
            Optional<LeadRequestOwner> owner,
            Optional<String> leadSource,
            Optional<String> title,
            Optional<String> company,
            Optional<String> firstName,
            Optional<String> lastName,
            Optional<List<AddressRequest>> addresses,
            Optional<List<EmailAddressRequest>> emailAddresses,
            Optional<List<PhoneNumberRequest>> phoneNumbers,
            Optional<OffsetDateTime> convertedDate,
            Optional<LeadRequestConvertedContact> convertedContact,
            Optional<LeadRequestConvertedAccount> convertedAccount,
            Optional<Map<String, JsonNode>> integrationParams,
            Optional<Map<String, JsonNode>> linkedAccountParams,
            Optional<List<RemoteFieldRequest>> remoteFields) {
        this.owner = owner;
        this.leadSource = leadSource;
        this.title = title;
        this.company = company;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
        this.convertedDate = convertedDate;
        this.convertedContact = convertedContact;
        this.convertedAccount = convertedAccount;
        this.integrationParams = integrationParams;
        this.linkedAccountParams = linkedAccountParams;
        this.remoteFields = remoteFields;
    }

    /**
     * @return The lead's owner.
     */
    @JsonProperty("owner")
    public Optional<LeadRequestOwner> getOwner() {
        return owner;
    }

    /**
     * @return The lead's source.
     */
    @JsonProperty("lead_source")
    public Optional<String> getLeadSource() {
        return leadSource;
    }

    /**
     * @return The lead's title.
     */
    @JsonProperty("title")
    public Optional<String> getTitle() {
        return title;
    }

    /**
     * @return The lead's company.
     */
    @JsonProperty("company")
    public Optional<String> getCompany() {
        return company;
    }

    /**
     * @return The lead's first name.
     */
    @JsonProperty("first_name")
    public Optional<String> getFirstName() {
        return firstName;
    }

    /**
     * @return The lead's last name.
     */
    @JsonProperty("last_name")
    public Optional<String> getLastName() {
        return lastName;
    }

    @JsonProperty("addresses")
    public Optional<List<AddressRequest>> getAddresses() {
        return addresses;
    }

    @JsonProperty("email_addresses")
    public Optional<List<EmailAddressRequest>> getEmailAddresses() {
        return emailAddresses;
    }

    @JsonProperty("phone_numbers")
    public Optional<List<PhoneNumberRequest>> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * @return When the lead was converted.
     */
    @JsonProperty("converted_date")
    public Optional<OffsetDateTime> getConvertedDate() {
        return convertedDate;
    }

    /**
     * @return The contact of the converted lead.
     */
    @JsonProperty("converted_contact")
    public Optional<LeadRequestConvertedContact> getConvertedContact() {
        return convertedContact;
    }

    /**
     * @return The account of the converted lead.
     */
    @JsonProperty("converted_account")
    public Optional<LeadRequestConvertedAccount> getConvertedAccount() {
        return convertedAccount;
    }

    @JsonProperty("integration_params")
    public Optional<Map<String, JsonNode>> getIntegrationParams() {
        return integrationParams;
    }

    @JsonProperty("linked_account_params")
    public Optional<Map<String, JsonNode>> getLinkedAccountParams() {
        return linkedAccountParams;
    }

    @JsonProperty("remote_fields")
    public Optional<List<RemoteFieldRequest>> getRemoteFields() {
        return remoteFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LeadRequest && equalTo((LeadRequest) other);
    }

    private boolean equalTo(LeadRequest other) {
        return owner.equals(other.owner)
                && leadSource.equals(other.leadSource)
                && title.equals(other.title)
                && company.equals(other.company)
                && firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && addresses.equals(other.addresses)
                && emailAddresses.equals(other.emailAddresses)
                && phoneNumbers.equals(other.phoneNumbers)
                && convertedDate.equals(other.convertedDate)
                && convertedContact.equals(other.convertedContact)
                && convertedAccount.equals(other.convertedAccount)
                && integrationParams.equals(other.integrationParams)
                && linkedAccountParams.equals(other.linkedAccountParams)
                && remoteFields.equals(other.remoteFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.owner,
                this.leadSource,
                this.title,
                this.company,
                this.firstName,
                this.lastName,
                this.addresses,
                this.emailAddresses,
                this.phoneNumbers,
                this.convertedDate,
                this.convertedContact,
                this.convertedAccount,
                this.integrationParams,
                this.linkedAccountParams,
                this.remoteFields);
    }

    @Override
    public String toString() {
        return "LeadRequest{" + "owner: " + owner + ", leadSource: " + leadSource + ", title: " + title + ", company: "
                + company + ", firstName: " + firstName + ", lastName: " + lastName + ", addresses: " + addresses
                + ", emailAddresses: " + emailAddresses + ", phoneNumbers: " + phoneNumbers + ", convertedDate: "
                + convertedDate + ", convertedContact: " + convertedContact + ", convertedAccount: " + convertedAccount
                + ", integrationParams: " + integrationParams + ", linkedAccountParams: " + linkedAccountParams
                + ", remoteFields: " + remoteFields + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<LeadRequestOwner> owner = Optional.empty();

        private Optional<String> leadSource = Optional.empty();

        private Optional<String> title = Optional.empty();

        private Optional<String> company = Optional.empty();

        private Optional<String> firstName = Optional.empty();

        private Optional<String> lastName = Optional.empty();

        private Optional<List<AddressRequest>> addresses = Optional.empty();

        private Optional<List<EmailAddressRequest>> emailAddresses = Optional.empty();

        private Optional<List<PhoneNumberRequest>> phoneNumbers = Optional.empty();

        private Optional<OffsetDateTime> convertedDate = Optional.empty();

        private Optional<LeadRequestConvertedContact> convertedContact = Optional.empty();

        private Optional<LeadRequestConvertedAccount> convertedAccount = Optional.empty();

        private Optional<Map<String, JsonNode>> integrationParams = Optional.empty();

        private Optional<Map<String, JsonNode>> linkedAccountParams = Optional.empty();

        private Optional<List<RemoteFieldRequest>> remoteFields = Optional.empty();

        private Builder() {}

        public Builder from(LeadRequest other) {
            owner(other.getOwner());
            leadSource(other.getLeadSource());
            title(other.getTitle());
            company(other.getCompany());
            firstName(other.getFirstName());
            lastName(other.getLastName());
            addresses(other.getAddresses());
            emailAddresses(other.getEmailAddresses());
            phoneNumbers(other.getPhoneNumbers());
            convertedDate(other.getConvertedDate());
            convertedContact(other.getConvertedContact());
            convertedAccount(other.getConvertedAccount());
            integrationParams(other.getIntegrationParams());
            linkedAccountParams(other.getLinkedAccountParams());
            remoteFields(other.getRemoteFields());
            return this;
        }

        @JsonSetter(value = "owner", nulls = Nulls.SKIP)
        public Builder owner(Optional<LeadRequestOwner> owner) {
            this.owner = owner;
            return this;
        }

        public Builder owner(LeadRequestOwner owner) {
            this.owner = Optional.of(owner);
            return this;
        }

        @JsonSetter(value = "lead_source", nulls = Nulls.SKIP)
        public Builder leadSource(Optional<String> leadSource) {
            this.leadSource = leadSource;
            return this;
        }

        public Builder leadSource(String leadSource) {
            this.leadSource = Optional.of(leadSource);
            return this;
        }

        @JsonSetter(value = "title", nulls = Nulls.SKIP)
        public Builder title(Optional<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(String title) {
            this.title = Optional.of(title);
            return this;
        }

        @JsonSetter(value = "company", nulls = Nulls.SKIP)
        public Builder company(Optional<String> company) {
            this.company = company;
            return this;
        }

        public Builder company(String company) {
            this.company = Optional.of(company);
            return this;
        }

        @JsonSetter(value = "first_name", nulls = Nulls.SKIP)
        public Builder firstName(Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = Optional.of(firstName);
            return this;
        }

        @JsonSetter(value = "last_name", nulls = Nulls.SKIP)
        public Builder lastName(Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = Optional.of(lastName);
            return this;
        }

        @JsonSetter(value = "addresses", nulls = Nulls.SKIP)
        public Builder addresses(Optional<List<AddressRequest>> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder addresses(List<AddressRequest> addresses) {
            this.addresses = Optional.of(addresses);
            return this;
        }

        @JsonSetter(value = "email_addresses", nulls = Nulls.SKIP)
        public Builder emailAddresses(Optional<List<EmailAddressRequest>> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }

        public Builder emailAddresses(List<EmailAddressRequest> emailAddresses) {
            this.emailAddresses = Optional.of(emailAddresses);
            return this;
        }

        @JsonSetter(value = "phone_numbers", nulls = Nulls.SKIP)
        public Builder phoneNumbers(Optional<List<PhoneNumberRequest>> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public Builder phoneNumbers(List<PhoneNumberRequest> phoneNumbers) {
            this.phoneNumbers = Optional.of(phoneNumbers);
            return this;
        }

        @JsonSetter(value = "converted_date", nulls = Nulls.SKIP)
        public Builder convertedDate(Optional<OffsetDateTime> convertedDate) {
            this.convertedDate = convertedDate;
            return this;
        }

        public Builder convertedDate(OffsetDateTime convertedDate) {
            this.convertedDate = Optional.of(convertedDate);
            return this;
        }

        @JsonSetter(value = "converted_contact", nulls = Nulls.SKIP)
        public Builder convertedContact(Optional<LeadRequestConvertedContact> convertedContact) {
            this.convertedContact = convertedContact;
            return this;
        }

        public Builder convertedContact(LeadRequestConvertedContact convertedContact) {
            this.convertedContact = Optional.of(convertedContact);
            return this;
        }

        @JsonSetter(value = "converted_account", nulls = Nulls.SKIP)
        public Builder convertedAccount(Optional<LeadRequestConvertedAccount> convertedAccount) {
            this.convertedAccount = convertedAccount;
            return this;
        }

        public Builder convertedAccount(LeadRequestConvertedAccount convertedAccount) {
            this.convertedAccount = Optional.of(convertedAccount);
            return this;
        }

        @JsonSetter(value = "integration_params", nulls = Nulls.SKIP)
        public Builder integrationParams(Optional<Map<String, JsonNode>> integrationParams) {
            this.integrationParams = integrationParams;
            return this;
        }

        public Builder integrationParams(Map<String, JsonNode> integrationParams) {
            this.integrationParams = Optional.of(integrationParams);
            return this;
        }

        @JsonSetter(value = "linked_account_params", nulls = Nulls.SKIP)
        public Builder linkedAccountParams(Optional<Map<String, JsonNode>> linkedAccountParams) {
            this.linkedAccountParams = linkedAccountParams;
            return this;
        }

        public Builder linkedAccountParams(Map<String, JsonNode> linkedAccountParams) {
            this.linkedAccountParams = Optional.of(linkedAccountParams);
            return this;
        }

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<List<RemoteFieldRequest>> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(List<RemoteFieldRequest> remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
            return this;
        }

        public LeadRequest build() {
            return new LeadRequest(
                    owner,
                    leadSource,
                    title,
                    company,
                    firstName,
                    lastName,
                    addresses,
                    emailAddresses,
                    phoneNumbers,
                    convertedDate,
                    convertedContact,
                    convertedAccount,
                    integrationParams,
                    linkedAccountParams,
                    remoteFields);
        }
    }
}
