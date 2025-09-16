plugins { application }
repositories { mavenCentral() }
dependencies { implementation("io.undertow:undertow-core:2.3.12.Final") }
application { mainClass.set("com.ploy.app.Main") }
tasks.withType(JavaCompile).configureEach { options.release = 17 }
