/**
 * ajax.js 
 */
 
 //비동기
 let val = 10;
 setTimeout(function(){
 	val +=5;
 	console.log('hello javascript->'+val);
  
  setTimeout(function(){
 		val +=3;
 		console.log('hello ajax->'+val);
 	
 		setTimeout(function(){
 			val +=4;
 			console.log('hello ajax->'+val);

 			},1000);

 	},1000);
 	
 },2000);

 let success = true;
 let promise = new Promise(function(resolve,reject){
 	
 	if (success){
 	resolve('success');
 	} else {
 	reject('error');
 	}
 });
 	promise.then(function(result){
 		console.log(resolve);
 	
 	})
 		.then(function (result){
 		console.log(result);
 		})
 		
 		.then(function (result){
 		consolo.log(result);
 		})
 		.catch(function(err){
 			console.log(err);
 		});
 	
 
 
 
 