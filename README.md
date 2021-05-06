# Transciption
用讯飞语音转写平台的demo代码做了一些修改，加上了保存本地json和转为带时间轴的txt功能

## 使用说明：
这个项目的src/main/java里有四个java文件

### UploadToJson.java
main方法是将音频文件上传到讯飞平台。
首先请在APP_ID和SECRECT_KEY区域输入在讯飞平台申请到的ID和KEY
AUDIO_FILE_PATH的导入音频路径设置为自己的本地文件路径+文件名的形式
后面方法暂时没有摸索（本人没用到）
### SaveJson.java
将讯飞平台返回的json保存到本地
同样请修改路径到本地需要保存的地方

以上修改完成后运行UploadToJson.main即可

### JsonToTxt.java
### VoiceRecord.java
这两个是将上面从讯飞平台得到的json转为看得懂的txty用
同样请修改第一个文件里的保存路径后运行JsonToTxt.main即可得到对应的txt
