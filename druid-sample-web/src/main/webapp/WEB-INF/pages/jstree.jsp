<%--
  Created by IntelliJ IDEA.
  User: xiaofeng.huang
  Date: 16/7/13
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js"></script>
    <%--<script src="/js/jquery-2.1.1.min.js"></script>--%>
<%----%>
    <%--<link rel="stylesheet" href="/styles/themes/default/style.min.css">--%>
    <%--<script src="/js/jtree.js"></script>--%>

</head>
<body>

<form id="s">
    <input type="search" id="q"/>
    <button type="submit">Search</button>
</form>

<span>广告系列列表</span>

<div id="container"></div>

<script>

    $(function () {
        $('#container').jstree({
            'core': {
                'data':  {
                    "url" : "http://localhost:8082/twilight/stree",
                    "dataType" : "json" // needed only if you do not supply JSON headers,
                },
                "themes": {
                    "theme": "default",
                    "dots": false,
                    "icons": false
                }
            },
            "search": {
                show_only_matches: true
            },
            "plugins": [
                "search", "sort", "themes","changed"
            ]
        });

        $('#container').on("changed.jstree", function (e, data) {
            console.log(data.node.text); // newly selected
//            console.log(data.changed.deselected); // newly deselected

        })
        $("#s").submit(function (e) {
            e.preventDefault();
            $("#container").jstree(true).search($("#q").val());
        });



    });
</script>
</body>
</html>
