* skip to content


FABRIC WIKI


USER TOOLS

 * Register
 * Log In


SITE TOOLS

Search

ToolsShow pagesourceOld revisionsBacklinksRecent ChangesSitemapRegisterLog In>
 * Recent Changes
 * Sitemap

Trace: • Welcome to the Fabric Wiki!

----------------------------------------

start


TABLE OF CONTENTS

 * Welcome to the Fabric Wiki!
   * Player Tutorials
   * Mod Developer Tutorials
   * Documentation
   * Modpack and Launcher Developers
   * Community
   * Contributing to the Wiki


WELCOME TO THE FABRIC WIKI!

This resource is dedicated to Fabric. Fabric is a modular modding toolchain targeting Minecraft: Java Edition 1.14 and above, including snapshots.

Some pages on the wiki may be out-of-date or a work in progress.

This wiki is also available in the following languages:

 * 简体中文 (Simplified Chinese)
 * Français (French)
 * Deutsch (German)
 * 한국어 (Korean)
 * Русский (Russian)
 * 日本語 (Japanese)
 * Español

Make sure to check out our community spaces and rules!

 * Frequently Asked Questions (from users)
 * Frequently Asked Questions (expert mode) - a supplement to the above with more detailed answers


PLAYER TUTORIALS

If you wish to use Fabric as a player, server administrator or modpack developer, you should view the Player Tutorials section of the wiki.

 * Installing Fabric Loader
 * Updating Fabric Loader
 * Installing Java
 * Troubleshooting

----------------------------------------


MOD DEVELOPER TUTORIALS

If you'd like to start developing with Fabric, you should check out the Mod Developer Tutorials section of the wiki.

 * Creating Your First Mod
 * Creating Your First Item
 * Creating Your First Block
 * Saving Custom Data Across Restarts
 * Data Generation
 * World Generation
 * Introduction to Mixins
 * Creating Commands
 * Events
 * Entities
 * Fluids

----------------------------------------


DOCUMENTATION

If you want to know how projects in the Fabric toolchain work, you should check out the Documentation section of the wiki.

 * Specifications
 * Technical Information
 * External Documentation

----------------------------------------


MODPACK AND LAUNCHER DEVELOPERS

These pages may be slightly outdated, we are currently in process of rewriting them.

Please keep in mind that we recommend using Minecraft Launcher and MCUpdater for modpack play and distribution. However, that doesn't stop us from trying to support other solutions!

 * Using MCUpdater for Fabric modpacks (covers usage and creation)
 * Publishing Fabric modpacks on Technic
 * Publishing Fabric modpacks on ATLauncher
 * Modpack-related endpoints
 * Dependency Overrides (Loader 0.11.1 or later!)

----------------------------------------


COMMUNITY

Feeling like participating in Fabric community? You may see our official community spaces, or also understand the library mods or OptiFine alternatives provided by the community. All community pages can be found in the sidebar of this page.

----------------------------------------


CONTRIBUTING TO THE WIKI

The Wiki is mostly maintained by the community, for the community. If you are interested in contributing to the wiki, check out the following pages first:

 * Wiki Meta - Starting point for contributing to the wiki
 * Wiki Agenda - See what is on the current agenda, and what other contributors are currently working on.

start.txt · Last modified: 2024/11/01 01:14 by cassiancc

----------------------------------------


PAGE TOOLS

 * Show pagesource
 * Old revisions
 * Backlinks
 * Back to top

Except where otherwise noted, content on this wiki is licensed under the following license: CC Attribution-Noncommercial-Share Alike 4.0 International

---

Berikut adalah konten yang diambil dari URL yang diberikan:[1]

Halaman tersebut adalah "Developer Guides" untuk Fabric Documentation. Ini mencakup berbagai topik mulai dari pengaturan lingkungan pengembangan hingga area yang lebih lanjut seperti rendering dan jaringan. Beberapa panduan yang tersedia meliputi:

*   **Memulai:** Pengantar Fabric dan Modding, Menyiapkan Lingkungan Pengembangan, Membuat Proyek, Struktur Proyek, Meluncurkan Game.
*   **Item:** Membuat Item Pertama Anda, Item Makanan, Alat Kustom, Armor Kustom, Grup Item Kustom, Interaksi Item Kustom, Efek Enchantment Kustom, Komponen Data Kustom, Ramuan.
*   **Blok:** Membuat Blok Pertama Anda, Block States, Block Entities, Block Entity Renderers.
*   **Entitas:** Status Efek, Jenis Kerusakan.
*   **Suara:** Memainkan Suara, Membuat Suara Kustom, Suara Dinamis.
*   **Perintah:** Membuat Perintah, Argumen Perintah, Saran Perintah.
*   **Rendering:** Menggunakan Konteks Gambar, Rendering di HUD, GUI dan Layar, Layar Kustom, Widget Kustom.
*   **Partikel:** Membuat Partikel Kustom.
*   **Pembuatan Data:** Pengaturan Pembuatan Data, Pembuatan Tag, Pembuatan Terjemahan, Pembuatan Kemajuan, Pembuatan Resep, Pembuatan Tabel Loot, Pembuatan Model Blok.
*   **Halaman Lain-lain:** Codecs, Events, Networking, Teks dan Terjemahan, Debugging Mods, Tips dan Trik IDE, Pengujian Otomatis, Loom Gradle Plugin, Fabric API DSL, Opsi Ekstensi, Tugas Jalankan Produksi.

Dokumentasi ini ditulis untuk versi 1.21.8 dan menyebutkan bahwa mod yang berfungsi penuh dengan semua kode untuk dokumentasi ini tersedia di folder `/reference` di GitHub.[1]

Sources:
[1] Developer Guides | Fabric Documentation (https://docs.fabricmc.net/develop/)

---

**Nama Proyek:** Mixin (SpongePowered/Mixin)

**Deskripsi:**
Mixin adalah *framework* untuk *trait/mixin* dan *bytecode weaving* untuk Java yang menggunakan ASM. Ini berfungsi dengan menyisipkan ke dalam proses *classloading* saat *runtime* melalui serangkaian layanan yang dapat dicolokkan (baik bawaan maupun disediakan pengguna).

**Lisensi:**
Proyek ini dilisensikan di bawah **MIT license**.

**Statistik:**
*   **Bintang (Stars):** 1.6k
*   **Fork:** 208

**Dokumentasi:**
*   Dokumentasi utama dapat ditemukan di **Wiki** proyek.
*   Dokumentasi tambahan untuk fitur dan anotasi individual tersedia di **Javadoc** yang ekstensif.
*   Bantuan lebih lanjut dapat diperoleh melalui saluran **#mixin** di Server Discord Sponge.

**Biner (Binaries):**
Biner Mixin tersedia melalui Jenkins dan dipublikasikan ke repositori Maven berikut:
*   `https://repo.spongepowered.org/repository/maven-public/` (untuk SNAPSHOTs dan RELEASE builds)
*   `https://files.minecraftforge.net/maven/` (hanya untuk RELEASE builds)

**Perkakas (Tooling):**
*   Mixin menyediakan **Annotation Processor** untuk menangani tugas *obfuscation* yang bekerja pada waktu kompilasi.
*   Untuk proyek Minecraft Forge, plugin **MixinGradle** dapat digunakan untuk menyederhanakan konfigurasi Mixin Annotation Processor.

**Integrasi IDE:**
*   **Eclipse:** Dapat diintegrasikan dengan mengaktifkan Annotation Processor dan menambahkan JAR Mixin yang dihasilkan.
*   **IntelliJ IDEA:** Fungsionalitas yang ditingkatkan tersedia melalui plugin "Minecraft Development for IntelliJ IDEA".

**Riwayat Versi:**
Halaman tersebut juga mencantumkan riwayat versi yang ekstensif, merinci fitur dan perubahan yang diperkenalkan di setiap versi, mulai dari versi 0.1 (Januari 2015) hingga 0.8.5 (Desember 2021).

---

*   **FabricMC/fabric-loom**: Ini adalah plugin sistem build Gradle yang berfungsi untuk mengotomatiskan pengaturan lingkungan pengembangan mod Minecraft. Plugin ini mendukung pemetaan kecil (yang digunakan oleh Yarn), menggunakan dekompiler Fernflower dan CFR untuk menghasilkan kode sumber dengan komentar, dan dirancang untuk versi Minecraft modern (diuji dengan 1.14.4 ke atas).
*   **FabricMC/fabric**: Repositori ini berisi *library* yang menyediakan *hook* esensial dan mekanisme interoperabilitas untuk mod Fabric. Ini mencakup fungsionalitas yang berguna namun sulit diakses (seperti partikel, bioma, dan dimensi), menambahkan *event*, *hook*, dan API untuk meningkatkan interoperabilitas antar mod, serta fitur penting seperti sinkronisasi registri dan penambahan informasi ke laporan *crash*.
*   **FabricMC/yarn**: Ini adalah kumpulan pemetaan Minecraft yang bersifat bebas dan dapat digunakan oleh siapa saja di bawah lisensi Creative Commons Zero. Tujuannya adalah untuk memungkinkan pengembangan mod Minecraft secara bebas dan terbuka, serta memberikan kebebasan untuk berinovasi dan memproses pemetaan sesuai kebutuhan.
