[TOC]



### git 基础命令

#### 创建仓库（repository）

1. 创建一个空目录：`mkdir learngit`

2. 初始化仓库：`git init`

   把这个目录变成Git可以管理的仓库，完成后会多一个隐藏目录 .git

#### 添加文件到仓库

1. `git add <filename>`
2. `git commit -m <message>`

#### 添加远程库

1. 先在 github 上新建一个仓库

2. 将本地仓库与远程仓库关联：

   `git remote add origin git@github.com:xieziwei99/learngit.git`

3. 将本地库内容推送到远程：

   第一次：`git push -u origin master`

   后几次：`git push`

#### 从远程库克隆

- 克隆：`git clone git@github.com:xieziwei99/learngit.git`
- 之后获取更新：`git pull`