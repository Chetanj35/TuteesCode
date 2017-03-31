function msg()
{
	var name=document.myForm.name.value;
	var password=document.myForm.password.value;
	var contact=document.myForm.contact.value;
	var collegeID=document.myForm.collegeID.value;
	
	var  qualification =document.myForm.qualification.value;
	var gender=document.myForm.gender.value;
	
	if(name==null || name=="")
		{
			alert("Name can't be empty ! ");
			return false;
		}
	
	var x=document.myForm.email.value;
	 var atpos = x.indexOf("@");
	var dotpos = x.lastIndexOf(".");
	if(atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
		{alert("Please Enter correct Email ID");
		return false;}
	
	else  if (password.length>15 || password.length=="") {
		alert("Password can't be empty and can be of maximum 15 length");
		return false;
		}
	
	
	 else if(gender==null || gender=="")
		{
			alert("Gender can't be empty ! ");
			return false;
		}
	else if(contact=="" || isNaN(contact) || contact.length!=10)
	 { 
		alert("Contact can't be empty or  can be of 10 numerics ");
		return false;
	 }
	else if(collegeID==null || collegeID=="")
	{
		alert("College ID can't be empty ! ");
		return false;
	}

	
	 else if(qualification==null || qualification=="")
	{
		alert("Qualification can't be empty ! ");
		return false;
	}
	
}