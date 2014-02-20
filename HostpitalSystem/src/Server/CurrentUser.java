package Server;


/**
 * CurrentUser represents the current user that has logged on to
 * the movie booking system. It is a singleton class.
 */
public class CurrentUser {
    /**
     * The single instance of this class
     */
    private static CurrentUser instance;
        
    /**
     * The name of the current user.
     */
    private String currentPnbr;
    
    private int currentLevel;
    
    private String currentDivision;
    /**
     * Create a CurrentUser object.
     */
    private CurrentUser() {
        currentPnbr = null;
        currentLevel = 0;
        currentDivision = null;
    }
        
    /**
     * Returns the single instance of this class.
     *
     * @return The single instance of the class.
     */
    public static CurrentUser instance() {
        if (instance == null)
            instance = new CurrentUser();
        return instance;
    }
        
    /**
     * Check if a user has logged in.
     *
     * @return true if a user has logged in, false otherwise.
     */
    public boolean isLoggedIn() {
        return currentPnbr != null;
    }
        
    /** 
     * Get the user id of the current user. Should only be called if
     * a user has logged in.
     *
     * @return The user id of the current user.
     */
    public String getPnbr() {
        return currentPnbr == null ? "<none>" : currentPnbr;
    }
        
    /**
     * A new user logs in.
     *
     * @param userId The user id of the new user.
     */
    public void loginAs(String userId, int level, String division) {
        currentPnbr = userId;
        currentLevel = level;
        currentDivision = division;
    }
    
    public int getLevel(){
    	return currentLevel == 0 ? 0 : currentLevel;
    }
    
    public String getDivision(){
    	return currentDivision;
    }
}
   
