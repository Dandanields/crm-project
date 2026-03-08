const URL = "http://localhost:8080/api/customers";

async function submitCustomer() {
  const customer = {
    firstname: document.getElementById("fname").value,
    lastname: document.getElementById("lname").value,
    email: document.getElementById("mail").value,
  };

  if (!customer.firstname || !customer.lastname || !customer.email) {
    alert("Fehler: Bitte alle Felder ausfüllen");
    return;
  }

  try {
    const response = await fetch(URL, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(customer),
    });

    if (response.ok) {
      const newCustomer = await response.json();
      addToList(newCustomer);
      clearForm();
    }
  } catch (err) {
    console.error("Server nicht erreichbar", err);
  }
}

function addToList(c) {
  const list = document.getElementById("list");
  const item = document.createElement("div");
  item.className = "card";
  item.innerHTML = `<strong>${c.id}</strong>: ${c.firstname} ${c.lastname} (${c.email})`;
  list.prepend(item);
}

function clearForm() {
  document.getElementById("fname").value = "";
  document.getElementById("lname").value = "";
  document.getElementById("mail").value = "";
}
