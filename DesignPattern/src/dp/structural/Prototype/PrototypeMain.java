package dp.structural.Prototype;

/**
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。
 * 当直接创建对象的代价比较大时，则采用这种模式。
 * 
 * 例如，一个对象需要在一个高代价的数据库操作之后被创建。
 * 我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，
 * 以此来减少数据库调用。
 * 
 * 我们将创建一个抽象类 Shape 和扩展自 Shape 类的实体类。
 * 下一步是定义类 ShapeCache，该类把 shape 对象存储在一个 Hashtable 中，
 * 并在请求的时候返回它们的克隆。
 * @author Administrator
 *
 */

public class PrototypeMain {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape shape = ShapeCache.getShape("circle");
		shape.info();
		
		shape = ShapeCache.getShape("rectangle");
		shape.info();
		
		shape = ShapeCache.getShape("square");
		shape.info();
		
		shape = (Shape) shape.clone();
		shape.info();
	}
}
