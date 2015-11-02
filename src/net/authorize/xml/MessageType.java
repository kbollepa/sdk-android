package net.authorize.xml;

public enum MessageType {
    /**
     * Message : Unknown Error
     */
    E00000("E00000", "Unknown"),

    /**
     * Message : Successful
     */
    I00001("I00001", "Successful"),

    /**
     * Message : The record has already been deleted
     */
    I00003("I00003", "The record has already been deleted"),

    /**
     * Message : The mobile device has been submitted for approval by the account administrator.
     */
    I00005("I00005", "The mobile device has been submitted for approval by the account administrator."),

    /**
     * Message : The mobile device is approved and ready for use.
     */
    I00006("I00006", "The mobile device is approved and ready for use."),

    /**
     * Message : An error occurred during processing. Please try again.
     */
    E00001("E00001", "An error occurred during processing. Please try again."),

    /**
     * Message : The content-type specified is not supported.
     */
    E00002("E00002", "The content-type specified is not supported."),

    /**
     * Message : An error occurred while parsing the XML request.
     */
    E00003("E00003", "An error occurred while parsing the XML request."),

    /**
     * Message : The name of the requested API method is invalid.
     */
    E00004("E00004", "The name of the requested API method is invalid."),

    /**
     * Message : The merchantAuthentication.transactionKey is invalid or not present.
     */
    E00005("E00005", "The merchantAuthentication.transactionKey is invalid or not present."),

    /**
     * Message : The merchantAuthentication.name is invalid or not present.
     */
    E00006("E00006", "The merchantAuthentication.name is invalid or not present."),

    /**
     * Message : User authentication failed due to invalid authentication values.
     */
    E00007("E00007", "User authentication failed due to invalid authentication values."),

    /**
     * Message : User authentication failed. The payment gateway account or user is inactive.
     */
    E00008("E00008", "User authentication failed. The payment gateway account or user is inactive."),

    /**
     * Message : The payment gateway account is in Test Mode. The request cannot be processed.
     */
    E00009("E00009", "The payment gateway account is in Test Mode. The request cannot be processed."),

    /**
     * Message : User authentication failed. You do not have the appropriate permissions.
     */
    E00010("E00010", "User authentication failed. You do not have the appropriate permissions."),

    /**
     * Message : Access denied. You do not have the appropriate permissions.
     */
    E00011("E00011", "Access denied. You do not have the appropriate permissions."),

    /**
     * Message : A duplicate subscription already exists.
     */
    E00012("E00012", "A duplicate subscription already exists."),

    /**
     * Message : The field is invalid.
     */
    E00013("E00013", "The field is invalid."),

    /**
     * Message : A required field is not present.
     */
    E00014("E00014", "A required field is not present."),

    /**
     * Message : The field length is invalid.
     */
    E00015("E00015", "The field length is invalid."),

    /**
     * Message : The field type is invalid.
     */
    E00016("E00016", "The field type is invalid."),

    /**
     * Message : The startDate cannot occur in the past.
     */
    E00017("E00017", "The startDate cannot occur in the past."),

    /**
     * Message : The credit card expires before the subscription startDate.
     */
    E00018("E00018", "The credit card expires before the subscription startDate."),

    /**
     * Message : The customer taxId or driversLicense information is required.
     */
    E00019("E00019", "The customer taxId or driversLicense information is required."),

    /**
     * Message : The payment gateway account is not enabled for eCheck.Net subscriptions.
     */
    E00020("E00020", "The payment gateway account is not enabled for eCheck.Net subscriptions."),

    /**
     * Message : The payment gateway account is not enabled for credit card subscriptions.
     */
    E00021("E00021", "The payment gateway account is not enabled for credit card subscriptions."),

    /**
     * Message : The interval length cannot exceed 365 days or 12 months.
     */
    E00022("E00022", "The interval length cannot exceed 365 days or 12 months."),

    /**
     * Message : The trialOccurrences is required when trialAmount is specified.
     */
    E00024("E00024", "The trialOccurrences is required when trialAmount is specified."),

    /**
     * Message : Automated Recurring Billing is not enabled.
     */
    E00025("E00025", "Automated Recurring Billing is not enabled."),

    /**
     * Message : Both trialAmount and trialOccurrences are required.
     */
    E00026("E00026", "Both trialAmount and trialOccurrences are required."),

    /**
     * Message : The test transaction was unsuccessful.
     */
    E00027("E00027", "The test transaction was unsuccessful."),

    /**
     * Message : The trialOccurrences must be less than totalOccurrences.
     */
    E00028("E00028", "The trialOccurrences must be less than totalOccurrences."),

    /**
     * Message : Payment information is required.
     */
    E00029("E00029", "Payment information is required."),

    /**
     * Message : A paymentSchedule is required.
     */
    E00030("E00030", "A paymentSchedule is required."),

    /**
     * Message : The amount is required.
     */
    E00031("E00031", "The amount is required."),

    /**
     * Message : The startDate is required.
     */
    E00032("E00032", "The startDate is required."),

    /**
     * Message : The subscription Start Date cannot be changed.
     */
    E00033("E00033", "The subscription Start Date cannot be changed."),

    /**
     * Message : The interval information cannot be changed.
     */
    E00034("E00034", "The interval information cannot be changed."),

    /**
     * Message : Subscription not found.
     */
    E00035("E00035", "The subscription cannot be found."),

    /**
     * Message : The payment type cannot be changed.
     */
    E00036("E00036", "The payment type cannot be changed."),

    /**
     * Message : The subscription cannot be updated.
     */
    E00037("E00037", "The subscription cannot be updated."),

    /**
     * Message : The subscription cannot be canceled.
     */
    E00038("E00038", "The subscription cannot be canceled."),

    /**
     * Message : The root node does not reference a valid XML namespace.
     */
    E00045("E00045", "The root node does not reference a valid XML namespace."),

    /**
     * Message : The mobile device is not registered with this merchant account.
     */
    E00054("E00054", "The mobile device is not registered with this merchant account."),

    /**
     * Message : The mobile device is pending approval by the account administrator.
     */
    E00055("E00055", "The mobile device is pending approval by the account administrator."),

    /**
     * Message : The mobile device has been disabled for use with this account.
     */
    E00056("E00056", "The mobile device has been disabled for use with this account."),

    /**
     * Message : The user does not have permissions to submit requests from a mobile device.
     */
    E00057("E00057", "The user does not have permissions to submit requests from a mobile device."),

    /**
     * Message : The merchant has met or exceeded the number of pending mobile devices permitted for this account.
     */
    E00058("E00058", "The merchant has met or exceeded the number of pending mobile devices permitted for this account."),

    /**
     * Message : The authentication type is not allowed for this method call.
     */
    E00059("E00059", "The authentication type is not allowed for this method call.");

    final private String value;
    private String text;

    /**
     * MessageType constructor
     *
     * @param value
     * @param text
     */
    private MessageType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * Lookup a response reason code by the reason response code itself.
     *
     * @param value
     * @return Returns a MessageType from it's value if found.
     */
    public static MessageType findByValue(String value) {
        for (MessageType errorMessage : values()) {
            if (errorMessage.value.equals(value)) {
                return errorMessage;
            }
        }

        return E00000; // unknown
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the value of Enum
     */
    public String getValue() {
        return value;
    }


}
