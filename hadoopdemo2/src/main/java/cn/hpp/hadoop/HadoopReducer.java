package cn.hpp.hadoop;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class HadoopReducer extends
		Reducer<Text, IntWritable, Text, IntWritable> {

	protected void reduce(Text keyin, Iterable<IntWritable> valuein, Context context)
			throws IOException, InterruptedException {
		int maxValue = Integer.MIN_VALUE;
		for(IntWritable v:valuein){
			maxValue = Math.max(maxValue, v.get());
		}
		context.write(keyin, new IntWritable(maxValue));
	}

}
