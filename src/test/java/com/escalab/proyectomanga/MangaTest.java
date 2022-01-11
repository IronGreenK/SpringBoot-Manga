package com.escalab.proyectomanga;

import com.escalab.proyectomanga.model.Manga;
import com.escalab.proyectomanga.repository.MangaRepository;
import com.escalab.proyectomanga.service.MangaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@SpringBootTest
public class MangaTest{


    @MockBean
    MangaRepository repo;

    @Autowired
    MangaService mangaService;


    @Test
    public void getManga() throws Exception {
        int mangaId = 10;
        Manga ma = new Manga();
        ma.setIdManga(mangaId);
        ma.setTitulo("Test");
        when(repo.findById(mangaId)).thenReturn(Optional.of(ma));
        Manga manga = mangaService.findById(mangaId);
        assertEquals(manga.getIdManga(), mangaId);
        assertEquals(manga.getTitulo(), "Test");
    }

    @Test
    public void getAllPaciente(){
        Manga ma = new Manga();
        ma.setIdManga(12);
        ma.setTitulo("Test");
        ma.setAño(2022);
        List<Manga> mangas = new ArrayList<>();
        mangas.add(ma);
        when(repo.findAll()).thenReturn(mangas);
        List<Manga> mangaList = mangaService.findAll();
        assertEquals(mangaList.get(0).getTitulo(), "Test");
        assertEquals(mangaList.get(0).getAño(), 2022);
    }
}
