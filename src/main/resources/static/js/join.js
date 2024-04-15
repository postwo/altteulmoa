

//api
function execPostCode() {
    new daum.Postcode({
        oncomplete: function(data) {
        
           var fullRoadAddr = data.roadAddress; 
           var extraRoadAddr = ''; 

           
           if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
               extraRoadAddr += data.bname;
           }
           
           if(data.buildingName !== '' && data.apartment === 'Y'){
              extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
           }
          
           if(extraRoadAddr !== ''){
               extraRoadAddr = ' (' + extraRoadAddr + ')';
           }
          
           if(fullRoadAddr !== ''){
               fullRoadAddr += extraRoadAddr;
           }
         
           $("[name=streetAddress]").val(fullRoadAddr); 
           $("[name=streetDetailAddress]").val(data.bname);
           
           
       }
    }).open();
}






