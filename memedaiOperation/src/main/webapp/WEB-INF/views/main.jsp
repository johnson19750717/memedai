<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="http://cdn.sockjs.org/sockjs-0.3.min.js"></script>
    <script src="resources/js/stomp.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<body>
<h2>Hello World!</h2>
Current User:${user}
<a href="logout">logout</a>
<script>
    var socket = new SockJS("/main/ws");
    var stompClient = Stomp.over(socket);

    // Callback function to be called when stomp client is connected to server
    var connectCallback = function() {
        stompClient.subscribe('/topic/price', renderPrice);
    };

    // Callback function to be called when stomp client could not connect to server
    var errorCallback = function(error) {
        alert(error.headers.message);
    };

    function renderPrice(data) {
      alert(data);
    }
    function add() {
        stompClient.send("/main/upstream", {}, "hello world");
    }
    // Connect to server via websocket
    stompClient.connect("guest", "guest", connectCallback, errorCallback);
</script>

<button id="btn" value="broadcast" onclick="add()">add</button>

</body>
</html>
