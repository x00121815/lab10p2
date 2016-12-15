
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Product],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products")/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <a href=""""),_display_(/*10.27*/routes/*10.33*/.HomeController.products(0)),format.raw/*10.60*/("""" class="list-group-item">All categories</a>
                """),_display_(/*11.18*/for(c <- categories) yield /*11.38*/ {_display_(Seq[Any](format.raw/*11.40*/("""
                    """),format.raw/*12.21*/("""<a href=""""),_display_(/*12.31*/routes/*12.37*/.HomeController.products(c.getId)),format.raw/*12.70*/("""" class="list-group-item">"""),_display_(/*12.97*/c/*12.98*/.getName),format.raw/*12.106*/("""
                        """),format.raw/*13.25*/("""<span class="badge">"""),_display_(/*13.46*/c/*13.47*/.getProducts.size()),format.raw/*13.66*/("""</span>
                    </a>
                """)))}),format.raw/*15.18*/("""
            """),format.raw/*16.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*20.12*/if(flash.containsKey("success"))/*20.44*/ {_display_(Seq[Any](format.raw/*20.46*/("""
              """),format.raw/*21.15*/("""<div class="alert alert-success">
              """),_display_(/*22.16*/flash/*22.21*/.get("success")),format.raw/*22.36*/("""
              """),format.raw/*23.15*/("""</div>
          """)))}),format.raw/*24.12*/("""
          """),format.raw/*25.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
            """),_display_(/*40.14*/for(p <- products) yield /*40.32*/ {_display_(Seq[Any](format.raw/*40.34*/("""
			    """),format.raw/*41.8*/("""<tr>
                  <td>"""),_display_(/*42.24*/p/*42.25*/.getId),format.raw/*42.31*/("""</td>
                  <td>"""),_display_(/*43.24*/p/*43.25*/.getName),format.raw/*43.33*/("""</td>
                  <td>"""),_display_(/*44.24*/p/*44.25*/.getCategory.getName),format.raw/*44.45*/("""</td>
                  <td>"""),_display_(/*45.24*/p/*45.25*/.getDescription),format.raw/*45.40*/("""</td>
                  <td>"""),_display_(/*46.24*/p/*46.25*/.getStock),format.raw/*46.34*/("""</td>
                  <td>&euro; """),_display_(/*47.31*/("%.2f".format(p.getPrice))),format.raw/*47.58*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*51.33*/routes/*51.39*/.HomeController.updateProduct(p.getId)),format.raw/*51.77*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*56.33*/routes/*56.39*/.HomeController.deleteProduct(p.getId)),format.raw/*56.77*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				</tr>
					""")))}),format.raw/*62.7*/(""" """),format.raw/*62.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*66.21*/routes/*66.27*/.HomeController.addProduct()),format.raw/*66.55*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*75.27*/("""{"""),format.raw/*75.28*/("""
        """),format.raw/*76.9*/("""return confirm('Are you sure?');
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/("""
  """),format.raw/*78.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(products,categories)

  def f:((List[models.Product],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (products,categories) => apply(products,categories)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 17:36:18 GMT 2016
                  SOURCE: /home/wdd/webapps/Lab10part2/app/views/products.scala.html
                  HASH: cf9ab476edef1d17db5c7d83ef02c4d97255ed4e
                  MATRIX: 787->1|949->68|977->70|1037->103|1065->104|1111->123|1139->124|1167->125|1214->147|1238->163|1277->165|1306->168|1516->351|1531->357|1579->384|1668->446|1704->466|1744->468|1793->489|1830->499|1845->505|1899->538|1953->565|1963->566|1993->574|2046->599|2094->620|2104->621|2144->640|2225->690|2266->703|2355->765|2396->797|2436->799|2479->814|2555->863|2569->868|2605->883|2648->898|2697->916|2736->927|3230->1394|3264->1412|3304->1414|3339->1422|3394->1450|3404->1451|3431->1457|3487->1486|3497->1487|3526->1495|3582->1524|3592->1525|3633->1545|3689->1574|3699->1575|3735->1590|3791->1619|3801->1620|3831->1629|3894->1665|3942->1692|4078->1801|4093->1807|4152->1845|4411->2077|4426->2083|4485->2121|4738->2344|4766->2345|4886->2438|4901->2444|4950->2472|5213->2707|5242->2708|5278->2717|5342->2754|5370->2755|5400->2758
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|46->15|47->16|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|55->24|56->25|71->40|71->40|71->40|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|82->51|82->51|82->51|87->56|87->56|87->56|93->62|93->62|97->66|97->66|97->66|106->75|106->75|107->76|108->77|108->77|109->78
                  -- GENERATED --
              */
          