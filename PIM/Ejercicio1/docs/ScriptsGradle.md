# Scripts de Gradle
## Script de compilación general
Un proyecto Android define un script de configuración general build.gradle.ktspara el proyecto, ubicado en la carpeta raíz, y otro ubicado en la appcarpeta , que hace referencia al módulo de la aplicación en sí.

El contenido del script de compilación general tendrá la siguiente estructura:
```
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}
```

## Script de 