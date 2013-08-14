package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.about.index;

public class About extends Controller {
    public static Result index() {
        return ok(index.render());
    }
}
