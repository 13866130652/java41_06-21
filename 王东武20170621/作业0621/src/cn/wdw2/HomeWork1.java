package cn.wdw2;
/**
 * 3)、编写一个日期工具类：DateUtil类 (10分)
   3.1)、将字符串日期转换为日期类型，字符串格式为：”yyyy-MM-dd”，如果转换失败，则抛出异常。
 方法原型：public static Date convertToDate(String date) throws Exception{}
   3.2)、将日期类型转换为字符串类型，格式为：”yyyy-MM-dd”。
方法原型：public static String convertToDateString(Date date){ }
   3.3)、编写测试类Test,对以上两个方法进行测试。
 * @author Administrator
 *
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeWork1 {
	
		public static Date convertToDate(String date) throws Exception {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {
				return format.parse(date);
			} catch (Exception e) {
				throw new Exception("当前字符串无法解析为Date！");
			}
		}

		/**
		 * 将日期类型转换为字符串类型，格式为：”yyyy-MM-dd”。
		 */
		public static String convertToDateString(Date date) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			return format.format(date);
		}

		/**
		 * main（）
		 */
		public static void main(String[] args) {
			Date date = new Date();

			// 把Date转换为字符串
			String st = convertToDateString(date);
			System.out.println(st);

			// 把字符串解析为Date
			try {
				Date date1 = convertToDate(st);
				System.out.println(date1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

