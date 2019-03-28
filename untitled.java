public class Assert{
		public static boolean not_false(boolean condition){
			if(condition)
				return true;
			throw new Exception("Invalid Input");
		}

	}