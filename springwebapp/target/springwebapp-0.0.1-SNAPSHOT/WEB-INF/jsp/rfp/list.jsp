<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<body>

	<article>
	<section class="head">
		<h3>Active Projects</h3>
	</section>

	<section>
		<table class="unit_list">
			<tr>
				<th>Name</th>
				<th>Due Date</th>
				<th>Date Received</th>
				<th></th>
			</tr>
			<tr>
				<c:forEach items="${rfpList}" var="rfp">
					<td>${rfp.name }</td> 
					<td>${rfp.due_date }</td>
					<td>${rfp.date_received }</td>
					<td>
						<a href="/criteria/list"><i class="fa icon_links  fa-tags"></i></a>
						<a href="/cv/list"><i class="fa icon_links   fa-pencil-square-o"></i></a>
						<i class="fa icon_links fa-archive"></i>
						<a href="/rfp/remove?rfp_id=${rfp.rfp_id}">
							<i class="fa icon_links fa-trash"></i>
						</a>
					</td>
				
				</c:forEach>
				
			</tr>
			
		
		</table>
	</section>
	
</article>

<aside>
	<h3>Create new Project</h3>
	<form:form method="post" modelAttribute="rfp">
		<div>
			<label for="pname">Name</label>
			<input type="text" name="pname" value="DND ERP PA"/>
		</div>
		<div>
			<label for="due_date">Due Date</label>
			<input type="date" name="due_date" />
		</div>
		
		<div>
			<input type="submit" name="Upload" value="Save">
		</div>
	</form>
</aside>
	


</body>
</html>