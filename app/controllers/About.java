package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.about.index;

/**
 * Created with IntelliJ IDEA.
 * User: daegikim
 * Date: 8/4/13
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class About extends Controller {
    public static Result index() {
        return ok(index.render());
    }
}
