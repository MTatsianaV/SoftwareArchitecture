﻿using ClinicService.Models.Requests;
using ClinicService.Models;
using ClinicService.Services;
using ClinicService.Services.Impl;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace ClinicService.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class PetController : ControllerBase
    {

        private IPetRepository _petRepository;

        public PetController(IPetRepository petRepository)
        {
            _petRepository = petRepository;
        }

        [HttpPost("create")]
        public IActionResult Create([FromBody] CreatePetRequest createRequest)
        {
            Pet pet = new Pet();
            pet.Document = createRequest.ClientId;
            pet.SurName = createRequest.Name;
            pet.Birthday = createRequest.Birthday;
            return Ok(_petRepository.Create(pet));
        }

        [HttpPut("edit")]
        public IActionResult Update([FromBody] UpdatePetRequest updateRequest)
        {
            Pet pet = new Pet();
            pet.ClientId = updateRequest.PetId;
            pet.Document = updateRequest.ClientId;
            pet.SurName = updateRequest.Name;
            pet.Birthday = updateRequest.Birthday;
            return Ok(_petRepository.Update(pet));
        }


        [HttpDelete("delete")]
        public IActionResult Delete([FromQuery] int petId)
        {
            int res = _petRepository.Delete(petId);
            return Ok(res);
        }

        [HttpGet("get-all")]
        public IActionResult GetAll()
        {
            return Ok(_petRepository.GetAll());
        }

        [HttpGet("get/{clientId}")]
        public IActionResult GetById([FromRoute] int petId)
        {
            return Ok(_petRepository.GetById(petId));
        }

    }
}
