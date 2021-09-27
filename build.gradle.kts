/**
 * 将构建逻辑从 Groovy 迁移到 Kotlin
 */

/**
 * Gradle 构建语言参考
 * @description: 本参考指南将描述构成 Gradle 构建语言或 DSL 各种类型
 * @basic_knowledge：Gradle 脚本是配置脚本
 *      当脚本执行时，它配置一个特定类型的对象 project
 *      该对象称为 脚本 的 委托对象
 *      委托对象的属性和方法可在脚本中执行（每个 Gradle 脚本都实现了 Script 接口）
 *
 * 核心类型
 *      Project
 *          settings.gradle 根据Settings对象评估脚本 对其进行配置
 *          使用配置的Settings对象来创建Project实例的层次结构
 *
 *      Task
 *      Gradle
 *      Settings
 *      IncludedBuild
 *      Script
 */

/**
 * Gradle Kotlin DSL 入门
 *
 * Gradle 的 Kotlin DSL 提供了传统的 Groovy DSL 的替代语法
 *
 */