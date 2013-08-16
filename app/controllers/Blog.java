package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.blog.index;

public class Blog extends Controller {
    public static Result index() {
        return ok(index.render());
    }
}
