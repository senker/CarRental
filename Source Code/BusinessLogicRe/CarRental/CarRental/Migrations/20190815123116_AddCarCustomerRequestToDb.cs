using System;
using Microsoft.EntityFrameworkCore.Migrations;

namespace CarRental.Migrations
{
    public partial class AddCarCustomerRequestToDb : Migration
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
                    carDeposit = table.Column<float>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Car", x => x.registrationNumber);
                });

            migrationBuilder.CreateTable(
                name: "Customer",
                columns: table => new
                {
                    socialSecurityNumber = table.Column<string>(nullable: false),
                    firstName = table.Column<string>(nullable: false),
                    lastName = table.Column<string>(nullable: false),
                    dateOfBirth = table.Column<DateTime>(nullable: false),
                    address = table.Column<string>(nullable: false),
                    phoneNumber = table.Column<string>(nullable: false),
                    nationality = table.Column<string>(nullable: false),
                    driverLicenseId = table.Column<string>(nullable: false),
                    startDate = table.Column<DateTime>(nullable: false),
                    endDate = table.Column<DateTime>(nullable: false),
                    requestState = table.Column<string>(nullable: true),
                    requestedCar = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Customer", x => x.socialSecurityNumber);
                });
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Car");

            migrationBuilder.DropTable(
                name: "Customer");
        }
    }
}
