document.getElementById("studentForm").addEventListener("submit", async function (e) {
    e.preventDefault();

    const student = {
        name: document.getElementById("name").value,
        roll: parseInt(document.getElementById("roll").value),
        department: document.getElementById("dept").value
    };

    let response = await fetch("http://localhost:8080/addStudent", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(student)
    });

    document.getElementById("response").textContent = await response.text();
});
