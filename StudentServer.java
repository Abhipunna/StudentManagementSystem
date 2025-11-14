import static spark.Spark.*;
import com.google.gson.Gson;

public class StudentServer {
    static class Student {
        String name;
        int roll;
        String department;
    }

    public static void main(String[] args) {
        port(8080);
        Gson gson = new Gson();

        // GET example
        get("/hello", (req, res) -> "Student Management System Backend Running!");

        // POST example
        post("/addStudent", (req, res) -> {
            Student s = gson.fromJson(req.body(), Student.class);
            return "Student Added: " + s.name;
        });
    }
}
