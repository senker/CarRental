﻿// <auto-generated />
using System;
using CarRental.Model;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

namespace CarRental.Migrations
{
    [DbContext(typeof(ApplicationDbContext))]
    partial class ApplicationDbContextModelSnapshot : ModelSnapshot
    {
        protected override void BuildModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "2.2.6-servicing-10079")
                .HasAnnotation("Relational:MaxIdentifierLength", 128)
                .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

            modelBuilder.Entity("CarRental.Model.Car", b =>
                {
                    b.Property<string>("registrationNumber")
                        .ValueGeneratedOnAdd();

                    b.Property<string>("carBrand")
                        .IsRequired();

                    b.Property<string>("carColor")
                        .IsRequired();

                    b.Property<float>("carDeposit");

                    b.Property<string>("carDescription")
                        .IsRequired();

                    b.Property<string>("carModel")
                        .IsRequired();

                    b.Property<float>("carPrice");

                    b.Property<string>("engineCapacity")
                        .IsRequired();

                    b.Property<string>("fuelType")
                        .IsRequired();

                    b.Property<string>("gearboxType")
                        .IsRequired();

                    b.Property<string>("numberOfDoors")
                        .IsRequired();

                    b.Property<string>("yearOfProduction")
                        .IsRequired();

                    b.HasKey("registrationNumber");

                    b.ToTable("Car");
                });

            modelBuilder.Entity("CarRental.Model.Customer", b =>
                {
                    b.Property<string>("socialSecurityNumber")
                        .ValueGeneratedOnAdd();

                    b.Property<string>("address")
                        .IsRequired();

                    b.Property<DateTime>("dateOfBirth");

                    b.Property<string>("driverLicenseId")
                        .IsRequired();

                    b.Property<DateTime>("endDate");

                    b.Property<string>("firstName")
                        .IsRequired();

                    b.Property<string>("lastName")
                        .IsRequired();

                    b.Property<string>("nationality")
                        .IsRequired();

                    b.Property<string>("phoneNumber")
                        .IsRequired();

                    b.Property<string>("requestState");

                    b.Property<string>("requestedCar");

                    b.Property<DateTime>("startDate");

                    b.HasKey("socialSecurityNumber");

                    b.ToTable("Customer");
                });
#pragma warning restore 612, 618
        }
    }
}
