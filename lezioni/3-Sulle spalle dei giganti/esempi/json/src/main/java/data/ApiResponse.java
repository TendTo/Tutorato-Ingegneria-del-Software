package main.java.data;

public record ApiResponse(User[] users, Message[] messages) {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiResponse: {");
        sb.append("Users: [ ");
        if (users != null) {
            for (User user : users) {
                sb.append(user).append(", ");
            }
        }
        sb.append("] Messages: [ ");
        if (messages != null) {
            for (Message message : messages) {
                sb.append(message).append(", ");
            }
        }
        sb.append("]");
        sb.append(" }");
        return sb.toString();
    }
}
