# TV Material Catalog App

![Screenshot of TV Material Catalog](screenshot.png)

The TV Material Catalog demonstrates how to implement [Material Design](https://www.material.io) principles using [Compose for TV](https://developer.android.com/training/tv/playback/compose).

# 📺 TvMaterialCatalog

Aplicación independiente desarrollada en **Kotlin** para **Android TV**, enfocada en mostrar un **catálogo visual interactivo** con una interfaz limpia, moderna y totalmente adaptada a televisores.  
Implementa componentes del **Material Design** y la **Leanback Library**, optimizando la experiencia del usuario con control remoto.

---

## 🚀 Descripción general

**TvMaterialCatalog** permite explorar una galería de elementos visuales (imágenes, tarjetas, videos o productos) con transiciones fluidas, navegación simple y diseño escalable.  
Su arquitectura modular facilita la ampliación del contenido y la personalización de la interfaz para distintos contextos, como tiendas multimedia, portafolios o demostraciones de UI para TV.

---

## 🧠 Características principales

- 🎨 **Diseño adaptado a Android TV** con Material Design 3.
- 🧩 **Interfaz modular:** `MainActivity`, `CardPresenter`, `DetailsFragment`, `PlaybackFragment`.
- 🎥 **Reproducción multimedia** con control remoto.
- 📂 **Gestión de contenido** por categorías o catálogos visuales.
- 💡 **Soporte para navegación con D-pad / control remoto.**
- ⚙️ Configuración mediante **Gradle Kotlin DSL** (`build.gradle.kts`).

---

## 🧰 Tecnologías utilizadas

| Componente | Descripción |
|-------------|-------------|
| **Lenguaje:** | Kotlin |
| **Framework:** | Android Jetpack |
| **UI Library:** | Leanback, Material Design Components |
| **Build System:** | Gradle (Kotlin DSL) |
| **Entorno de desarrollo:** | Android Studio (Electric Eel o superior) |

---

## 🧩 Estructura del proyecto
TvMaterialCatalog/
│
├── app/
│ ├── src/main/java/com/example/tvmaterialcatalog/
│ │ ├── activities/
│ │ ├── fragments/
│ │ ├── adapters/
│ │ └── models/
│ ├── res/
│ ├── build.gradle.kts
│ └── proguard-rules.pro
│
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── screenshot.png
└── README.md

## 🔧 Requisitos de instalación

1. Tener instalado **Android Studio (Electric Eel o superior)**.  
2. Clonar el repositorio:
   ```bash
   git clone https://github.com/Yuu7657/TvMaterialCatalog.git

   Abrir el proyecto en Android Studio.
Sincronizar dependencias de Gradle.
Ejecutar en un emulador o dispositivo Android TV (API 29 o superior).

👨‍💻 Autor
Ricardo Mejía Santillán
Ingeniero en Desarrollo y Gestión de Software
📍 UTOM — Universidad Tecnológica del Oriente de Michoacán
💼 GitHub
