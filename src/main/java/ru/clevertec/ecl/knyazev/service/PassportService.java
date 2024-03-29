package ru.clevertec.ecl.knyazev.service;

import ru.clevertec.ecl.knyazev.data.domain.pagination.Paging;
import ru.clevertec.ecl.knyazev.data.http.passport.request.PostPutPassportRequestDTO;
import ru.clevertec.ecl.knyazev.data.http.passport.response.GetPassportResponseDTO;
import ru.clevertec.ecl.knyazev.service.exception.ServiceException;

import java.util.List;
import java.util.UUID;

/**
 * Represents service for Passport data
 */
public interface PassportService {
    /**
     * Get passport DTO by passport uuid
     *
     * @param passportUUID passport uuid
     * @return Passport data transfer object
     * @throws ServiceException when passport not found
     */
    GetPassportResponseDTO get(UUID passportUUID) throws ServiceException;

    /**
     * Get all passport data transfer objects, also using pagination
     *
     * @param paging query object
     * @return all passport DTOs by given paging object or empty list
     */
    List<GetPassportResponseDTO> getAll(Paging paging);

    /**
     * Add passport using passport DTO and get passport DTO as
     * result
     *
     * @param postPutPassportRequestDTO passport DTO
     * @return added passport DTO
     */
    GetPassportResponseDTO add(PostPutPassportRequestDTO postPutPassportRequestDTO);

    /**
     * Update existing passport using passport DTO and get passport DTO as
     * result
     *
     * @param postPutPassportRequestDTO passport DTO
     * @return updated passport DTO
     */
    GetPassportResponseDTO update(PostPutPassportRequestDTO postPutPassportRequestDTO);

    /**
     * Remove existing passport using its UUID
     *
     * @param passportUUID passport uuid
     */
    void remove(UUID passportUUID);
}
