package br.com.erudioester.mapper;

import java.util.ArrayList;
import java.util.List;

//import org.modelmapper.ModelMapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapper {
	
	// DozerBeanMapperBuilder: oferece métodos para construir e configurar instâncias de mapeadores Dozer
	//.buildDefault(): Esse método é usado para criar uma instância padrão do mapeador Dozer com configurações predefinidas. Basicamente, ele retorna um objeto que você pode usar para executar mapeamentos.
	// Usando essa instância de mapeador, você pode configurar mapeamentos entre classes, definir conversões personalizadas, estabelecer regras de mapeamento e, em seguida, usar o mapeador para realizar as conversões entre os objetos.
		
		//private static ModelMapper mapper = new ModelMapper();
		private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();
		
		public static <O, D> D parseObject(O origin, Class<D> destination) {
			return mapper.map(origin, destination);
		}
		
		public static <O, D> List<D> parseListObjects(List<O> origin, Class<D> destination) {
			List<D> destinationObjects = new ArrayList<D>();
			for (O o : origin) {
				destinationObjects.add(mapper.map(o, destination));
			}
			return destinationObjects;
		}

}
