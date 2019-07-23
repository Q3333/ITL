window.addEventListener("load",function(){
	
	var svgHeight = 240;	// SVG 요소의 높이
	var svgWidth = 320;		//SVG 요소의 넓이
	var dataSet = [50,30,12,5,3];	//데이터 셋, 비율을 나타냄 
	var color = d3.scaleOrdinal(d3.schemeCategory10);	//D3.js가 준비한 표준 색
	
	/*
	 * 	var colorScale_1 = d3.schemeCategory10;
	 *  var colorScale_2 = schemeCategory20;
	 *  var colorScale_3 = d3.schemeCategory20b;
	 *  var colorScale_4 = d3.schemeCategory20c
	 */
	
	// 원 그래프의 좌표값을 계산하는 메서드
	var pie = d3.pie()	// 원 그래프 레이아웃
	
	// 원 그래프의 외경,내경 설정 (원그래프 반지름 = outer, 도넛모양으로 만들고 싶으면 inner도 설정)
	var arc = d3.arc().innerRadius(0).outerRadius(100);
	
	//원 그래프 그리기
	
	var pieElements = d3.select("#myGraph")
	.selectAll("path")	// path 요소 지정
	.data(pie(dataSet))	//데이터를 요소에 연결, d3.pie함수는 데이터의 부채꼴의 좌표를 계산해서 
	
	//데이터 추가
	pieElements.enter() // 데이터 수만큼 반복
	.append("path") // 데이터 수만큼 rect 요소가 추가됨
	.attr("class", "pie") // CSS클래스 설정
	.attr("d",arc)	//부채꼴 지정
	.attr("transform", "translate("+svgWidth/2+", "+svgHeight/2+")")//원의 정 중앙에 위치시키기

	.style("fill",function(d,i){
		return color(i);
	})
	
	
	
	.transition()
	.duration(1000)
	.delay(function(d,i){	// 그릴 원 그래프의 시간을 어긋나게 표시
		return i*1000;
	})
	.ease(d3.easeLinear) //  직성적인 에니메이션 움직임으로 변경
	// 시간에 따라 도형을 변환시키기위해 시간에 따라 속성값을 변화시키는
	.attrTween("d",function(d,i){	// 보간 처리
		var interpolate = d3.interpolate(
				//각 부분의 시작 각도
		{	startAngle : d.startAngle, endAngle : d.startAngle },
				//각 부분의 종료 각도
		{	startAngle : d.startAngle, endAngle : d.endAngle }
	);
		return function(t){	//t는 시간
			return arc(interpolate(t));	//시간에 따라 처리
		}
			
		
	})
	
		// 숫자를 부채꼴의 가운데에 표시
	var textElements = d3.select ("#myGraph")
	.append("text")
	.attr("class", "total")
	.attr("transform", "translate("+svgWidth/2+", " +(svgHeight/2+5)+")")
	.text("합계 : " + d3.sum(dataSet))	//합계표시
	
	
});	// addEventListener() end



