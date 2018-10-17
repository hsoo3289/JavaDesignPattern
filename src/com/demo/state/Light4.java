package com.demo.state;
/**
 * State Pattern으로 Light 3을 구현
 * On, Off state pattern에 Sleeping 추가
 * 객체 생성보다 Singleton 사용이 메모리 재사용 측면에서 더 좋음
 * @author hsoo3
 * @since 20181017
 */
public class Light4 {
	public static interface State {
		public void onButtonPushed(Light light);
		public void offButtonPushed(Light light);
	}
	
	public static class On implements State {

		@Override
		public void onButtonPushed(Light light) {
			System.out.println("Sleeping Mode");
			light.setState(new Sleeping());
		}

		@Override
		public void offButtonPushed(Light light) {
			System.out.println("Light off");
			light.setState(new Off());
		}
	}
	
	public static class Off implements State {

		@Override
		public void onButtonPushed(Light light) {
			System.out.println("Light On");
			light.setState(new On());
		}

		@Override
		public void offButtonPushed(Light light) {
			System.out.println("반응없음");
		}
		
	}
	
	public static class Sleeping implements State {
		@Override
		public void onButtonPushed(Light light) {
			System.out.println("Light On");
			light.setState(new On());
		}

		@Override
		public void offButtonPushed(Light light) {
			System.out.println("Light Off");
			light.setState(new Off());
		}
	}
	
	public static class Light {
		private State state;
		public Light() {
			state = new Off();
		}
		
		public void setState(State state) {
			this.state = state;
		}
		
		public void onButtonPushed() {
			state.onButtonPushed(this);
		}
		
		public void offButtonPushed() {
			state.offButtonPushed(this);
		}
	}
	
	public static void main(String[] args) {
		Light light = new Light();
		light.offButtonPushed();
		light.onButtonPushed();
		light.onButtonPushed();
		light.offButtonPushed();
		light.offButtonPushed();
	}
}