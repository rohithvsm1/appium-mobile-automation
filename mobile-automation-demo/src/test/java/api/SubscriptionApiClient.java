package api;

/**
 * Simulated API client for subscription-related data.
 * In real projects this would call REST endpoints.
 */
public class SubscriptionApiClient {

    /**
     * Simulates fetching subscription status from backend.
     *
     * @param userId user identifier
     * @return subscription status
     */
    public String getSubscriptionStatus(String userId) {
        // Stubbed response for demo purposes
        // Replace with REST call when needed
        return "ACTIVE";
    }

    /**
     * Simulates activating a subscription.
     *
     * @param userId user identifier
     * @return true if activation succeeded
     */
    public boolean activateSubscription(String userId) {
        // Stub logic
        return true;
    }
}
