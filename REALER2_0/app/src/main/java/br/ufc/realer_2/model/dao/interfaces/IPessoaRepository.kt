package br.ufc.realer_2.model.dao.interfaces

import br.ufc.realer_2.model.dao.DBEntities.Pessoa

interface IPessoaRepository {
    fun Add(pessoa: Pessoa)
    fun GetPersonById(id: Int): Pessoa
    fun getAll(): MutableList<Pessoa>
}