package expressions;

public class Component<T> {
	
	private T value;
	private Component<T> left;
	private Component<T> right;
	private ComponentType type;
	
	public Component(Component<T> left, Component<T> right, T value) {
		this.left = left;
		this.right = right;
		this.value = value;
		
		if(isLeaf()){
			this.type = ComponentType.OPERAND;
		}else{
			this.type = ComponentType.OPERATOR;
		}
	}
	
	private boolean isLeaf(){
		return left == null && right == null;
	}
	
	public ComponentType getType(){
		return type;
	}
	
	public Component<T> left(){
		return left;
	}

	public Component<T> right(){
		return right;
	}
	
	public T value(){
		return value;
	}
}
