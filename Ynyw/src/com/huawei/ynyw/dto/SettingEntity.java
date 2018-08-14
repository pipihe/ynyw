package com.huawei.ynyw.dto;

public class SettingEntity
{
    /**
     * 视频初始播放成功率
     */
    private String stream_succ_rate;
    /**
     * 视频初始缓冲时延
     */
    private String stream_delay;
    /**
     * 视频播放停顿频次
     */
    private String stream_stall_time;
    /**
     * 视频下载速率
     */
    private String stream_dw_throughput;
    /**
     * 视频初始播放请求次数
     */
    private String stream_initial_play_time;
    /**
     * get响应成功率
     */
    private String get_resp_succ;
    /**
     * 初始缓冲成功率
     */
    private String stream_buffer_succ;
    /**
     * DNS响应时长
     */
    private String dns_resp_duration;
    /**
     * TCP建链时长
     */
    private String tcp_duration;
    /**
     * GET响应时长
     */
    private String get_resp_duration;
    /**
     * 初始缓冲时长
     */
    private String start_buffer_duration;
    /**
     * 服务器侧上行TCP丢包率
     */
    private String server_top_tcp_rate;
    /**
     * 服务器侧下行TCP丢包率
     */
    private String server_under_tcp_rate;
    /**
     * 服务器侧RTT
     */
    private String server_rtt;
    /**
     * 终端侧RTT
     */
    private String terminal_rtt;
    /**
     * 上行TCP重传率
     */
    private String top_tcp_rate;
    /**
     * 下行TCP重传率
     */
    private String under_tcp_rate;
    /**
     * 接口以上异常次数
     */
    private String interface_top_exception_times;
    /**
     * 超出接口以上异常次数均值比例
     */
    private String interface_top_exception_times_proportion;
    /**
     * 接口一下异常次数
     */
    private String interface_under_exception_times;
    /**
     * 超出接口一下异常次数均值比例
     */
    private String interface_under_exception_times_proportion;
    /**
     * 高重要性阈值
     * 流量
     */
    private String high_flow;
    /**
     * 高重要性阈值
     * 高清视频请求次数
     */
    private String high_hd_stream_req_times;
    /**
     * 高重要性阈值
     * 高清视频占比
     */
    private String high_hd_stream_proportion;
    /**
     * 中重要性阈值
     * 流量
     */
    private String in_flow;
    /**
     * 中重要性阈值
     * 高清视频请求次数
     */
    private String in_hd_stream_req_times;
    /**
     * 中重要性阈值
     * 高清视频占比
     */
    private String in_hd_stream_proportion;
    public String getStream_succ_rate()
    {
        return stream_succ_rate;
    }
    public void setStream_succ_rate(String stream_succ_rate)
    {
        this.stream_succ_rate = stream_succ_rate;
    }
    public String getStream_delay()
    {
        return stream_delay;
    }
    public void setStream_delay(String stream_delay)
    {
        this.stream_delay = stream_delay;
    }
    public String getStream_stall_time()
    {
        return stream_stall_time;
    }
    public void setStream_stall_time(String stream_stall_time)
    {
        this.stream_stall_time = stream_stall_time;
    }
    public String getStream_dw_throughput()
    {
        return stream_dw_throughput;
    }
    public void setStream_dw_throughput(String stream_dw_throughput)
    {
        this.stream_dw_throughput = stream_dw_throughput;
    }
    public String getStream_initial_play_time()
    {
        return stream_initial_play_time;
    }
    public void setStream_initial_play_time(String stream_initial_play_time)
    {
        this.stream_initial_play_time = stream_initial_play_time;
    }
    public String getGet_resp_succ()
    {
        return get_resp_succ;
    }
    public void setGet_resp_succ(String get_resp_succ)
    {
        this.get_resp_succ = get_resp_succ;
    }
    public String getStream_buffer_succ()
    {
        return stream_buffer_succ;
    }
    public void setStream_buffer_succ(String stream_buffer_succ)
    {
        this.stream_buffer_succ = stream_buffer_succ;
    }
    public String getDns_resp_duration()
    {
        return dns_resp_duration;
    }
    public void setDns_resp_duration(String dns_resp_duration)
    {
        this.dns_resp_duration = dns_resp_duration;
    }
    public String getTcp_duration()
    {
        return tcp_duration;
    }
    public void setTcp_duration(String tcp_duration)
    {
        this.tcp_duration = tcp_duration;
    }
    public String getGet_resp_duration()
    {
        return get_resp_duration;
    }
    public void setGet_resp_duration(String get_resp_duration)
    {
        this.get_resp_duration = get_resp_duration;
    }
    public String getStart_buffer_duration()
    {
        return start_buffer_duration;
    }
    public void setStart_buffer_duration(String start_buffer_duration)
    {
        this.start_buffer_duration = start_buffer_duration;
    }
    public String getServer_top_tcp_rate()
    {
        return server_top_tcp_rate;
    }
    public void setServer_top_tcp_rate(String server_top_tcp_rate)
    {
        this.server_top_tcp_rate = server_top_tcp_rate;
    }
    public String getServer_under_tcp_rate()
    {
        return server_under_tcp_rate;
    }
    public void setServer_under_tcp_rate(String server_under_tcp_rate)
    {
        this.server_under_tcp_rate = server_under_tcp_rate;
    }
    public String getServer_rtt()
    {
        return server_rtt;
    }
    public void setServer_rtt(String server_rtt)
    {
        this.server_rtt = server_rtt;
    }
    public String getTerminal_rtt()
    {
        return terminal_rtt;
    }
    public void setTerminal_rtt(String terminal_rtt)
    {
        this.terminal_rtt = terminal_rtt;
    }
    public String getTop_tcp_rate()
    {
        return top_tcp_rate;
    }
    public void setTop_tcp_rate(String top_tcp_rate)
    {
        this.top_tcp_rate = top_tcp_rate;
    }
    public String getUnder_tcp_rate()
    {
        return under_tcp_rate;
    }
    public void setUnder_tcp_rate(String under_tcp_rate)
    {
        this.under_tcp_rate = under_tcp_rate;
    }
    public String getInterface_top_exception_times()
    {
        return interface_top_exception_times;
    }
    public void setInterface_top_exception_times(String interface_top_exception_times)
    {
        this.interface_top_exception_times = interface_top_exception_times;
    }
    public String getInterface_top_exception_times_proportion()
    {
        return interface_top_exception_times_proportion;
    }
    public void setInterface_top_exception_times_proportion(String interface_top_exception_times_proportion)
    {
        this.interface_top_exception_times_proportion = interface_top_exception_times_proportion;
    }
    public String getInterface_under_exception_times()
    {
        return interface_under_exception_times;
    }
    public void setInterface_under_exception_times(String interface_under_exception_times)
    {
        this.interface_under_exception_times = interface_under_exception_times;
    }
    public String getInterface_under_exception_times_proportion()
    {
        return interface_under_exception_times_proportion;
    }
    public void setInterface_under_exception_times_proportion(String interface_under_exception_times_proportion)
    {
        this.interface_under_exception_times_proportion = interface_under_exception_times_proportion;
    }
    public String getHigh_flow()
    {
        return high_flow;
    }
    public void setHigh_flow(String high_flow)
    {
        this.high_flow = high_flow;
    }
    public String getHigh_hd_stream_req_times()
    {
        return high_hd_stream_req_times;
    }
    public void setHigh_hd_stream_req_times(String high_hd_stream_req_times)
    {
        this.high_hd_stream_req_times = high_hd_stream_req_times;
    }
    public String getHigh_hd_stream_proportion()
    {
        return high_hd_stream_proportion;
    }
    public void setHigh_hd_stream_proportion(String high_hd_stream_proportion)
    {
        this.high_hd_stream_proportion = high_hd_stream_proportion;
    }
    public String getIn_flow()
    {
        return in_flow;
    }
    public void setIn_flow(String in_flow)
    {
        this.in_flow = in_flow;
    }
    public String getIn_hd_stream_req_times()
    {
        return in_hd_stream_req_times;
    }
    public void setIn_hd_stream_req_times(String in_hd_stream_req_times)
    {
        this.in_hd_stream_req_times = in_hd_stream_req_times;
    }
    public String getIn_hd_stream_proportion()
    {
        return in_hd_stream_proportion;
    }
    public void setIn_hd_stream_proportion(String in_hd_stream_proportion)
    {
        this.in_hd_stream_proportion = in_hd_stream_proportion;
    }
    @Override
    public String toString()
    {
        return "SettingEntity [stream_succ_rate=" + stream_succ_rate + ", stream_delay=" + stream_delay
                + ", stream_stall_time=" + stream_stall_time + ", stream_dw_throughput=" + stream_dw_throughput
                + ", stream_initial_play_time=" + stream_initial_play_time + ", get_resp_succ=" + get_resp_succ
                + ", stream_buffer_succ=" + stream_buffer_succ + ", dns_resp_duration=" + dns_resp_duration
                + ", tcp_duration=" + tcp_duration + ", get_resp_duration=" + get_resp_duration
                + ", start_buffer_duration=" + start_buffer_duration + ", server_top_tcp_rate=" + server_top_tcp_rate
                + ", server_under_tcp_rate=" + server_under_tcp_rate + ", server_rtt=" + server_rtt + ", terminal_rtt="
                + terminal_rtt + ", top_tcp_rate=" + top_tcp_rate + ", under_tcp_rate=" + under_tcp_rate
                + ", interface_top_exception_times=" + interface_top_exception_times
                + ", interface_top_exception_times_proportion=" + interface_top_exception_times_proportion
                + ", interface_under_exception_times=" + interface_under_exception_times
                + ", interface_under_exception_times_proportion=" + interface_under_exception_times_proportion
                + ", high_flow=" + high_flow + ", high_hd_stream_req_times=" + high_hd_stream_req_times
                + ", high_hd_stream_proportion=" + high_hd_stream_proportion + ", in_flow=" + in_flow
                + ", in_hd_stream_req_times=" + in_hd_stream_req_times + ", in_hd_stream_proportion="
                + in_hd_stream_proportion + "]";
    }
    
    
}
