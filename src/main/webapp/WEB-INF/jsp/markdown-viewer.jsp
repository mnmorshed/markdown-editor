<html>

<head>
<title>Markdown Viewer</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>

<body>
	<form action="/markdown-editor">
		<button type="submit"
			style="background-color: #F0F0F0; height: 50px; width: 100px">Edit</button>

		<button style="background-color: #00CCFF; height: 50px; width: 100px"
			disabled="disabled">View</button>
		<input type="text" name="rawContentFileName"
			value="${rawContentFileName}" hidden="true" /> ${markdownContent}
	</form>
</body>

</html>