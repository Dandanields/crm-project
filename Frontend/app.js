const form = document.getElementById("customerForm");

form.addEventListener("submit", async (e) => {
  e.preventDefault();

  const customerData = {
    firstname: document.getElementById("fname").value,
    lastname: document.getElementById("lname").value,
    email: document.getElementById("mail").value,
  };

  // Daten an das Java-Backend senden
  const response = await fetch("http://localhost:8080/api/customers/add", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(customerData),
  });

  if (response.ok) {
    const result = await response.json();
    renderCustomer(result); // Zeigt den neuen Kunden in der Liste an
  }
});

function renderCustomer(c) {
  const li = document.createElement("li");
  li.textContent = `${c.id}: ${c.firstname} ${c.lastname} (${c.email})`;
  document.getElementById("customerList").appendChild(li);
}
