class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    List<String> postSuggestions;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        postSuggestions = new ArrayList<>();
    }
}

public class SocialMediaPostAutoSuggestionSystem {
    public static void main(String[] args) {
        SocialMediaPostAutoSuggestionSystem suggestionSystem = new SocialMediaPostAutoSuggestionSystem();

        suggestionSystem.addPost("Excited for the weekend! #FridayFeeling");
        suggestionSystem.addPost("New blog post alert: Tips for productivity!");
        suggestionSystem.addPost("Throwback to an amazing vacation. #Memories");

        List<String> suggestions = suggestionSystem.getSuggestions("New");
        System.out.println("Post suggestions for 'New': " + suggestions); // Should return ["New blog post alert: Tips for productivity!"]
    }

