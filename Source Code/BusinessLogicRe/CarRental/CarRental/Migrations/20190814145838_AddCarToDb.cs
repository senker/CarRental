using Microsoft.EntityFrameworkCore.Migrations;

namespace CarRental.Migrations
{
    public partial class AddCarToDb : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Car",
                columns: table => new
                {
                    registrationNumber = table.Column<string>(nullable: false),
                    carModel = table.Column<string>(nullable: false),
                    carBrand = table.Column<string>(nullable: false),
                    yearOfProduction = table.Column<string>(nullable: false),
                    gearboxType = table.Column<string>(nullable: false),
                    numberOfDoors = table.Column<string>(nullable: false),
                    engineCapacity = table.Column<string>(nullable: false),
                    fuelType = table.Column<string>(nullable: false),
                    carColor = table.Column<string>(nullable: false),
                    carDescription = table.Column<string>(nullable: false),
                    carPrice = table.Column<float>(nullable: false),
                    carDeposit = table.Column<float>(nullable: false),
                    available = table.Column<bool>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Car", x => x.registrationNumber);
                });
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Car");
        }
    }
}
