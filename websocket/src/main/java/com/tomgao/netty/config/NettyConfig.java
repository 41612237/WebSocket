package com.tomgao.netty.config;


import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @author 高立赟
 * @Description 存储整个工程的全局配置
 * @Date 创建于 2021/11/15 15:42
 */
public class NettyConfig {

    /**
     * 存储每个客户端介入进来时的channel对象
     */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
