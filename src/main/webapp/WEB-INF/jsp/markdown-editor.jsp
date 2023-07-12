<html>

<head>
<title>Markdown Editor</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	function ClearFields() {

		document.getElementById("rawContentFileName").value = "";
		document.getElementById("content").value = "";
	}
</script>
<style>
textarea {
	width: 100%;
	height: 100%;
	min-height: 50px;
	padding: 10px;
	font-size: 16px;
	line-height: 1.5;
	resize: auto;
	min-height: 50px; /* disable resizing */
}
</style>
</head>

<body>
	<font color="red">${errorMessage}</font>
	<form method="post">

		<button type="reset" onclick="ClearFields();"
			style="background-color: #F0F0F0; height: 50px; width: 100px">New</button>
		<button style="background-color: #00CCFF; height: 50px; width: 100px"
			disabled="disabled">Edit</button>
		<button type="submit"
			style="background-color: #F0F0F0; height: 50px; width: 100px">View</button>
		<input type="text" id="rawContentFileName" name="rawContentFileName"
			value="${rawContentFileName}" hidden="true"\>
		<textarea id="content" name="content">${rawContent}</textarea>
		<script>
			$(document).ready(function() {
				$("#content").on("input", function() {
					this.style.height = "auto";
					this.style.height = this.scrollHeight + 10 + "px";
				});
			});
		</script>
	</form>
</body>

</html>