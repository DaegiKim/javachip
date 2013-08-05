package controllers;

import play.mvc.*;
import views.html.home.index;

public class Application extends Controller {
    public static Result index() {
        return ok(index.render());
    }
}
