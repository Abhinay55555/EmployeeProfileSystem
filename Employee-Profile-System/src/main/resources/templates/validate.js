function validate() {
    let x1 = document.getElementById("firstname");
    if (x1.value == "") {
      document.getElementById("p1").innerHTML = "*Firstname should not be empty*";
      return false;
    }

    let x2 = document.getElementById("lastname");
    if (x2.value == "") {
      document.getElementById("p2").innerHTML = "*Lastname should not be empty*";
      return false;
    }

    let x3 = document.getElementById("email");
    var regEx =
      /^[A-Z0-9][A-Z0-9._%+-]{0,63}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/;
    var validEmail = regEx.test(email);
    if (x3.value == "") {
      document.getElementById("p3").innerHTML = "*Enter a valid e-mail* ";
      return false;
    }

    if (x3.value != validEmail) {
      document.getElementById("p3").innerHTML = "*This email is not valid* ";
      return false;
    } else {
      return true;
    }


    let x4 = document.getElementById("dateofbirth");
    if (x4.value == "") {
      document.getElementById("p4").innerHTML = "*date of birth*";
      return false;
    }

    let x5 = document.getElementById("date of joining");
    if (x5.value == "") {
      document.getElementById("p5").innerHTML = "*date of joining*";
      return false;
    }

    let x6 = document.getElementById("mobile number");
      if (x6.value == "") {
        document.getElementById("p6").innerHTML = "*mobile number*";
        return false;
      }

      let x7 = document.getElementById("Salary");
      if (x7.value = ""){
      document.getElementById("p7").innerHTML = "*Salary*";
      return false;
      }

  }