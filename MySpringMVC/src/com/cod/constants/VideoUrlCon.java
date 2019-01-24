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
	 * 获取指定用户的一批有效视频（不包含删除、正在处理的视频）的信息，版本V1
	 */
	public static final String VIDEOS = "http://spark.bokecc.com/api/videos";
	
	/**
	 * 获取指定用户的一批有效视频（不包含删除、正在处理的视频）的信息，版本V2
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
	 * 按分类获取视频信息
	 */
	public static final String VIDEOS_CATEGORY = "http://spark.bokecc.com/api/videos/category";
	
	/**
	 * 获取视频播放代码
	 */
	public static final String VIDEO_PLAYCODE = "http://spark.bokecc.com/api/video/playcode";
	
	/**
	 * 编辑视频信息
	 */
	public static final String VIDEO_UPDATE = "http://spark.bokecc.com/api/video/update";
	
	/**
	 * 删除视频
	 */
	public static final String VIDEO_DELETE = "http://spark.bokecc.com/api/video/delete";
	
	/**
	 * 获取视频分类，V2版本
	 */
	public static final String VIDEO_CATEGORY_V2 = "http://spark.bokecc.com/api/video/category/v2";
	
	/**
	 * 获取视频分类，V1版本
	 */
	public static final String VIDEO_CATEGORY = "http://spark.bokecc.com/api/video/category";
	
	/**
	 * 创建视频分类
	 */
	public static final String CATEGORY_CREATE = "http://spark.bokecc.com/api/category/create";

	/**
	 * 编辑视频分类
	 */
	public static final String CATEGORY_UPDATE = "http://spark.bokecc.com/api/category/update";

	/**
	 * 删除视频分类
	 */
	public static final String CATEGORY_DELETE = "http://spark.bokecc.com/api/category/delete";
	
	/**
	 * 同步视频里列表
	 */
	public static final String PLAYLISTS = "http://spark.bokecc.com/api/playlists";
	
	/**
	 * 创建视频里列表
	 */
	public static final String PLAYLISTS_CREATE = "http://spark.bokecc.com/api/playlist/create";
	
	/**
	 * 编辑视频里列表
	 */
	public static final String PLAYLISTS_UPDATE = "http://spark.bokecc.com/api/playlist/update";
	
	/**
	 * 删除视频里列表
	 */
	public static final String PLAYLISTS_DELETE = "http://spark.bokecc.com/api/playlist/delete";
	
	/**
	 * 搜索视频
	 */
	public static final String VIDEOS_SEARCH = "http://spark.bokecc.com/api/videos/search";
	
	/**
	 * 播放量统计，获取用户维度下按小时统计的播放量，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_USER_HOURLY = "http://spark.bokecc.com/api/stats/playcount/user/hourly";
	
	/**
	 * 播放量统计，获取用户维度下按天统计的播放量，该接口提供多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_USER_DAILY = "http://spark.bokecc.com/api/stats/playcount/user/daily";
	
	/**
	 * 播放量统计，获取视频维度下按小时统计的播放量，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_VIDEO_HOURLY = "http://spark.bokecc.com/api/stats/playcount/video/hourly";

	/**
	 * 播放量统计，获取视频维度下按天统计的播放量，该接口提供多天的数据查询
	 */
	public static final String STATS_PLAYCOUNT_VIDEO_DAILY = "http://spark.bokecc.com/api/stats/playcount/video/daily";
	
	/**
	 * 播放量统计，获取⽤用户维度下按小时统计的播放时长，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_PLAYDURATION_USER_HOURLY = "http://spark.bokecc.com/api/stats/playduration/user/hourly";
		
	/**
	 * 播放量统计，获取用户维度下按天统计的播放时长，该接口提供多天的数据查询
	 */
	public static final String STATS_PLAYDURATION_USER_DAILY = "http://spark.bokecc.com/api/stats/playduration/user/daily";
		
	/**
	 * 播放量统计，获取视频维度下按小时统计的播放时长，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_PLAYDURATION_VIDEO_HOURLY = "http://spark.bokecc.com/api/stats/playduration/video/hourly";
		
	/**
	 * 播放量统计，获取视频维度下按天统计的播放时长，该接口提供多天的数据查询
	 */
	public static final String STATS_PLAYDURATION_VIDEO_DAILY = "http://spark.bokecc.com/api/stats/playduration/video/daily";
	
	/**
	 * 观众量统计，获取用户维度下按小时统计的观众量，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_UNIQUEVISITOR_USER_HOURLY = "http://spark.bokecc.com/api/stats/uniquevisitor/user/hourly";
	
	/**
	 * 观众量统计，获取用户维度下按天统计的观众量，该接口提供多天的数据查询
	 */
	public static final String STATS_UNIQUEVISITOR_USER_DAILY = "http://spark.bokecc.com/api/stats/uniquevisitor/user/daily";
	
	/**
	 * 新增观众量统计，获取用户维度下按小时统计的新增观众量，该接口仅提供某一天的数据查询
	 */
	public static final String STATS_NEWUNIQUEVISITOR_USER_HOURLY = "http://spark.bokecc.com/api/stats/newuniquevisitor/user/hourly";
		
	/**
	 * 新增观众量统计，获取用户维度下按天统计的新增观众量，该接口提供多天的数据查询
	 */
	public static final String STATS_NEWUNIQUEVISITOR_USER_DAILY = "http://spark.bokecc.com/api/stats/newuniquevisitor/user/daily";
	
	
	
	
	
	
	
	
}
