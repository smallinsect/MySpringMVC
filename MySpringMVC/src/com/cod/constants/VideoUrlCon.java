package com.cod.constants;

public class VideoUrlCon {
	
	/**
	 * 	获取指定用户的有效视频信息，V1版本
	 */
	public static final String VIDEO = "http://spark.bokecc.com/api/video";
	
	/**
	 * 	获取指定用户的有效视频信息，V2版本
	 */
	public static final String VIDEO_V2 = "http://spark.bokecc.com/api/video/v2";
	
	/**
	 * 	获取指定用户的有效视频信息，V3版本
	 */
	public static final String VIDEO_V3 = "http://spark.bokecc.com/api/video/v3";
	
	/**
	 * 	获取指定用户的有效视频信息，V4版本
	 */
	public static final String VIDEO_V4 = "http://spark.bokecc.com/api/video/v4";

	/**
	 * 	获取指定用户的一批有效视频（不包含删除、正在处理的视频）的信息，版本V1
	 */
	public static final String VIDEOS = "http://spark.bokecc.com/api/videos";
	
	/**
	 * 	获取指定用户的一批有效视频（不包含删除、正在处理的视频）的信息，版本V2
	 */
	public static final String VIDEOS_V2 = "http://spark.bokecc.com/api/videos/v2";
	
	/**
	 * 	获取指定用户的一批有效视频（不包含删除、正在处理的视频）的信息，版本V3
	 */
	public static final String VIDEOS_V3 = "http://spark.bokecc.com/api/videos/v3";
	
	/**
	 * 	获取指定用户的一批有效视频（不包含删除、正在处理的视频）的信息，版本V4
	 */
	public static final String VIDEOS_V4 = "http://spark.bokecc.com/api/videos/v4";
	
	/**
	 * 	按分类获取视频信息
	 */
	public static final String VIDEOS_CATEGORY = "http://spark.bokecc.com/api/videos/category";
	
	/**
	 * 	获取视频播放代码
	 */
	public static final String VIDEO_PLAYCODE = "http://spark.bokecc.com/api/video/playcode";
	
	/**
	 * 	编辑视频信息
	 */
	public static final String VIDEO_UPDATE = "http://spark.bokecc.com/api/video/update";
	
	/**
	 * 	删除视频
	 */
	public static final String VIDEO_DELETE = "http://spark.bokecc.com/api/video/delete";
	
	/**
	 * 	获取视频分类，V2版本
	 */
	public static final String VIDEO_CATEGORY_V2 = "http://spark.bokecc.com/api/video/category/v2";
	
	/**
	 * 	获取视频分类，V1版本
	 */
	public static final String VIDEO_CATEGORY = "http://spark.bokecc.com/api/video/category";
	
	/**
	 * 	创建视频分类
	 */
	public static final String CATEGORY_CREATE = "http://spark.bokecc.com/api/category/create";

	/**
	 * 	编辑视频分类
	 */
	public static final String CATEGORY_UPDATE = "http://spark.bokecc.com/api/category/update";

	/**
	 * 	删除视频分类
	 */
	public static final String CATEGORY_DELETE = "http://spark.bokecc.com/api/category/delete";
	
	/**
	 * 	同步视频里列表
	 */
	public static final String PLAYLISTS = "http://spark.bokecc.com/api/playlists";
	
	/**
	 * 	创建视频里列表
	 */
	public static final String PLAYLISTS_CREATE = "http://spark.bokecc.com/api/playlist/create";
	
	/**
	 * 	编辑视频里列表
	 */
	public static final String PLAYLISTS_UPDATE = "http://spark.bokecc.com/api/playlist/update";
	
	/**
	 * 	删除视频里列表
	 */
	public static final String PLAYLISTS_DELETE = "http://spark.bokecc.com/api/playlist/delete";
	
	/**
	 * 	搜索视频
	 */
	public static final String VIDEOS_SEARCH = "http://spark.bokecc.com/api/videos/search";
	
	/**
	 * 	播放量统计，获取用户维度下按小时统计的播放量，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_USER_HOURLY = "http://spark.bokecc.com/api/stats/playcount/user/hourly";
	
	/**
	 * 	播放量统计，获取用户维度下按天统计的播放量，该接口提供多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_USER_DAILY = "http://spark.bokecc.com/api/stats/playcount/user/daily";
	
	/**
	 * 	播放量统计，获取视频维度下按小时统计的播放量，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_VIDEO_HOURLY = "http://spark.bokecc.com/api/stats/playcount/video/hourly";

	/**
	 * 	播放量统计，获取视频维度下按天统计的播放量，该接口提供多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_VIDEO_DAILY = "http://spark.bokecc.com/api/stats/playcount/video/daily";
	
	/**
	 * 	播放量统计，获取⽤用户维度下按小时统计的播放时长，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_PLAYDURATION_USER_HOURLY = "http://spark.bokecc.com/api/stats/playduration/user/hourly";
		
	/**
	 * 	播放量统计，获取用户维度下按天统计的播放时长，该接口提供多天的数据查询
	 */
	public static final String STATS_PLAYDURATION_USER_DAILY = "http://spark.bokecc.com/api/stats/playduration/user/daily";
		
	/**
	 * 	播放量统计，获取视频维度下按小时统计的播放时长，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_PLAYDURATION_VIDEO_HOURLY = "http://spark.bokecc.com/api/stats/playduration/video/hourly";
		
	/**
	 * 	播放量统计，获取视频维度下按天统计的播放时长，该接口提供多天的数据查询
	 */
	public static final String STATS_PLAYDURATION_VIDEO_DAILY = "http://spark.bokecc.com/api/stats/playduration/video/daily";
	
	/**
	 * 	观众量统计，获取用户维度下按小时统计的观众量，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_UNIQUEVISITOR_USER_HOURLY = "http://spark.bokecc.com/api/stats/uniquevisitor/user/hourly";
	
	/**
	 * 	观众量统计，获取用户维度下按天统计的观众量，该接口提供多天的数据查询
	 */
	public static final String STATS_UNIQUEVISITOR_USER_DAILY = "http://spark.bokecc.com/api/stats/uniquevisitor/user/daily";
	
	/**
	 * 	新增观众量统计，获取用户维度下按小时统计的新增观众量，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_NEWUNIQUEVISITOR_USER_HOURLY = "http://spark.bokecc.com/api/stats/newuniquevisitor/user/hourly";
		
	/**
	 * 	新增观众量统计，获取用户维度下按天统计的新增观众量，该接口提供多天的数据查询
	 */
	public static final String STATS_NEWUNIQUEVISITOR_USER_DAILY = "http://spark.bokecc.com/api/stats/newuniquevisitor/user/daily";
	
	/**
	 *	新增观众量统计，获取用户维度下按天统计的播放比例，该接口提供多天的数据查询
	 */
	public static final String STATS_ATTENTION_USER_DAILY = "http://spark.bokecc.com/api/stats/attention/user/daily";
	
	/**
	 * 	新增观众量统计，获取视频维度下按天统计的播放比例，该接口提供多天的数据查询
	 */
	public static final String STATS_ATTENTION_VIDEO_DAILY = "http://spark.bokecc.com/api/stats/attention/video/daily";
		
	/**
	 * 	播放量排行统计，获取播放量排行，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_SORTED = "http://spark.bokecc.com/api/stats/playcount/sorted";
	
	/**
	 * 	域名播放量统计，获取用户维度下按天统计的域名播放量，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_USER_DAILY_DOMAIN = "http://spark.bokecc.com/api/stats/playcount/user/daily/domain";
		
	/**
	 * 	域名播放量统计，获取视频维度下按天统计的域名播放量，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_VIDEO_DAILY_DOMAIN = "http://spark.bokecc.com/api/stats/playcount/video/daily/domain";
	
	/**
	 * 	域名播放时长统计，获取用户维度下按天统计的域名播放时长，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYDURATION_USER_DAILY_DOMAIN = "http://spark.bokecc.com/api/stats/playduration/user/daily/domain";
		
	/**
	 * 	域名播放时长统计，获取视频维度下按天统计的域名播放时长，该接口提供一天或多天的数据查
	 */
	public static final String STATS_PLAYDURATION_VIDEO_DAILY_DOMAIN = "http://spark.bokecc.com/api/stats/playduration/video/daily/domain";
		
	/**
	 * 	设备类型播放量统计，获取用户维度下按天统计的设备类型播放量，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_USER_DAILY_DEVICE = "http://spark.bokecc.com/api/stats/playcount/user/daily/device";
		
	/**
	 * 	操作系统播放量统计，获取⽤用户维度下按天统计的操作系统播放量，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_USER_DAILY_OPERATINGSYSTEM = "http://spark.bokecc.com/api/stats/playcount/user/daily/operatingsystem";
		
	/**
	 * 	浏览器器播放量统计，获取用户维度下按天统计的浏览器器播放量量，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_USER_DAILY_BROWSER = "http://spark.bokecc.com/api/stats/playcount/user/daily/browser";
	
	/**
	 * 	地理位置播放量统计，获取用户维度下按天统计的地理位置播放量，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_USER_DAILY_LOCATION = "http://spark.bokecc.com/api/stats/playcount/user/daily/location";
	
	/**
	 * 	地理位置播放量统计，获取视频维度下按天统计的地理位置播放量，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_VIDEO_DAILY_LOCATION = "http://spark.bokecc.com/api/stats/playcount/video/daily/location";
		
	/**
	 * 	地理位置播放时长统计，获取用户维度下按天统计的地理位置播放时长，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYDURATION_USER_DAILY_LOCATION = "http://spark.bokecc.com/api/stats/playduration/user/daily/location";
		
	/**
	 * 	地理位置播放时长统计，获取视频维度下按天统计的地理位置播放时长，该接口提供一天或多天的数据查询
	 */
	public static final String STATS_PLAYDURATION_VIDEO_DAILY_LOCATION = "http://spark.bokecc.com/api/stats/playduration/video/daily/location";
		
	/**
	 * 	用户流量统计，通过该接口可以获取某用户某天的小时维度的流量信息
	 */
	public static final String TRAFFIC_USER_HOURLY = "http://spark.bokecc.com/api/traffic/user/hourly";
	
	/**
	 * 	用户流量统计，通过该接口可以获取某用户某天的小时维度的流量信息
	 */
	public static final String TRAFFIC_USER_DAILY = "http://spark.bokecc.com/api/traffic/user/daily";
		
	/**
	 * 	用户流量统计，通过该接口可以获取某用户一段时间内月维度的流量信息
	 */
	public static final String TRAFFIC_USER_MONTHLY = "http://spark.bokecc.com/api/traffic/user/monthly";
		
	/**
	 * 	视频流量统计，通过该接口可以获取某视频某天的小时维度的流量信息
	 */
	public static final String TRAFFIC_VIDEO_HOURLY = "http://spark.bokecc.com/api/traffic/video/hourly";
	
	/**
	 * 	视频流量统计，通过该接口可以获取某视频一段时间内天维度的流量信息
	 */
	public static final String TRAFFIC_VIDEO_DAILY = "http://spark.bokecc.com/api/traffic/video/daily";
	
	/**
	 * 	获取视频字幕下载地址，通过该接口可以获取视频字幕下载地址，音频转写后可用
	 */
	public static final String SUBTITLE_VIDEO = "http://spark.bokecc.com/api/subtitle/video";
	
	/**
	 * 	搜索视频字幕信息，通过该接口可以根据关键词搜索单个视频的字幕信息，音频转写后可用
	 */
	public static final String SUBTITLE_SEARCH_VIDEO = "http://spark.bokecc.com/api/subtitle/search/video";
	
	/**
	 * 	搜索用户字幕信息，通过该接口可以根据关键词搜索用户所有视频的字幕信息，音频转写后可用
	 */
	public static final String SUBTITLE_SEARCH_USER = "http://spark.bokecc.com/api/subtitle/search/user";
	
	/**
	 * 	获取用户自定义参数播放记录日志，通过该接口可以根据用户自定义的customid获取某用户下所有视频播放记录日志（需要用户实现自定义参数播放统计功能）
	 */
	public static final String PLAYLOG_CUSTOM_USER_V2 = "http://spark.bokecc.com/api/playlog/custom/user/v2";
		
	/**
	 * 	获取用户自定义参数播放记录日志，通过该接口可以根据用户自定义的customid获取某用户下所有视频播放记录日志（需要用户实现自定义参数播放统计功能）
	 */
	public static final String PLAYLOG_CUSTOM_USER = "http://spark.bokecc.com/api/playlog/custom/user";
	
	/**
	 * 	获取视频自定义参数播放记录日志，通过该接口可以根据用户自定义的customid获取某视频播放记录日志（需要用户实现⾃自定义参数播放统计功
	 */
	public static final String PLAYLOG_CUSTOM_VIDEO_V2 = "http://spark.bokecc.com/api/playlog/custom/video/v2";
	
	/**
	 * 	获取视频自定义参数播放记录日志，通过该接口可以根据用户自定义的customid获取某视频播放记录日志（需要用户实现⾃自定义参数播放统计功
	 */
	public static final String PLAYLOG_CUSTOM_VIDEO = "http://spark.bokecc.com/api/playlog/custom/video";
	
	/**
	 * 	获取视频播放记录日志，通过该接口可以根据用户自定义的customid获取某视频播放记录日志（需要用户实现自定义参数播放统计功
	 */
	public static final String PLAYLOG_VIDEO_V2 = "http://spark.bokecc.com/api/playlog/video/v2";
	
	/**
	 * 	获取视频播放记录日志，通过该接口可以根据用户自定义的customid获取某视频播放记录日志（需要用户实现自定义参数播放统计功
	 */
	public static final String PLAYLOG_VIDEO = "http://spark.bokecc.com/api/playlog/video";
	
	/**
	 *	 获取用户播放记录日志，通过该接口可以查询用户所有播放记录日志（需要用户实现自定义参数播放统计功能）
	 */
	public static final String PLAYLOG_USER_V2 = "http://spark.bokecc.com/api/playlog/user/v2";
	
	/**
	 * 	获取视频原片下载地址，通过该接口可以获取视频原片的下载地址
	 */
	public static final String VIDEO_ORIGINAL = "http://spark.bokecc.com/api/video/original";
	
	/**
	 * 	带宽详情信息统计，通过该接口可以获取指定时间内用户带宽详细信息
	 */
	public static final String BANDWIDTH_USER_DETAIL = "http://spark.bokecc.com/api/bandwidth/user/detail";
	
	/**
	 * 	获取视频打点信息，通过该接口可以获取单个视频打点信息
	 */
	public static final String MARK_VIDEO = "http://spark.bokecc.com/api/mark/video";
	
	/**
	 * 	获取视频打点信息，通过该接口可以批量获取单个视频打点信息
	 */
	public static final String MARK_VIDEOS = "http://spark.bokecc.com/api/mark/videos";
	
	/**
	 * 	获取单个视频播放密码，通过该接口可以获取单个视频播放密码
	 */
	public static final String PWD_VIDEO = "http://spark.bokecc.com/api/pwd/video";
	
	/**
	 * 	批量获取视频的播放密码，通过该接口可以批量获取多个视频播放密码
	 */
	public static final String PWD_VIDEOS = "http://spark.bokecc.com/api/pwd/videos";
	
	/**
	 * 	设置视频播放地址有效时长，通过该接口可以设置用户视频播放地址的有效时间 (需开通视频播放地址有效时长的设置权限)
	 */
	public static final String AUTHTIMEOUT_UPDATE = "http://spark.bokecc.com/api/authtimeout/update";
	
	/**
	 * 	设置单个视频播放密码，通过该接口可以修改一个视频的播放密码
	 */
	public static final String VIDEOPWD_UPDATE = "http://spark.bokecc.com/api/videopwd/update";
	
	/**
	 * 	设置一批视频播放密码，通过该接口可以修改一批视频的播放密码
	 */
	public static final String VIDEOPWDS_UPDATE = "http://spark.bokecc.com/api/videopwds/update";
}
