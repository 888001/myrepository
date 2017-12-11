package cn.hpp.hadoop;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * App主入口
 * 
 * @author win7
 * 
 */
public class App {

	public static void main(String[] a) throws Exception {
		String[] args = {"file:///F:\\hadoop-2.7.4\\hadoop-2.7.4\\download","F:\\hadoop-2.7.4\\hadoop-2.7.4\\program\\out"};
		if (args.length != 2) {
			System.err
					.println("Usage: MaxTemperature <input path> <output path>");
			System.exit(-1);
		}

		// 每一次map reduce 就叫做一次作业job
		// job需要设置信息,map task ,reduce task
		@SuppressWarnings("deprecation")
		Job job = new Job();
		
		Configuration conf = job.getConfiguration();
		//设置最大的切割尺寸
		conf.setLong(FileInputFormat.SPLIT_MAXSIZE,1024*15);
		
		
		job.setJarByClass(App.class);
		// 设置job名称,便于调试
		job.setJobName("job名称");
		// 设置输入路径,可以有多个,文件和文件夹,不会递归处理的
		FileInputFormat.addInputPath(job, new Path(args[0]));
		// 设置输出路径,只能设置一个,动态创建输出路径,不能存在
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		// 设置mapper类
		job.setMapperClass(HadoopMapper.class);
		// 设置reducer类
		job.setReducerClass(HadoopReducer.class);
		// 只设置输出,不用设置输入
		// 设置输出key的类
		job.setOutputKeyClass(Text.class);
		// 设置输出value的类
		job.setOutputValueClass(IntWritable.class);

		// 等待作业的完成
		boolean b = job.waitForCompletion(true);
		System.out.println(b ? "成功!" : "失败");
	}

}
