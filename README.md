# Scala 3 + sbt + Scala.js Example for GitHub Codespaces

## Features

- Scala 3
- sbt (build tool)
- Scala.js support
- Ready-to-use in GitHub Codespaces

## Usage

1. **Open in GitHub Codespaces**  
   Click the green "Code" button in GitHub, then "Open with Codespaces".

2. **Run Scala code (JVM):**
   ```
   sbt run
   ```

3. **Build Scala.js output:**
   ```
   sbt fastLinkJS
   ```
   Output will be in `target/scala-3.3.3/scalajs-example-fastopt/main.js`.

4. **Edit and develop!**  
   The Metals extension provides IDE features.

## Project layout

- `build.sbt` — sbt build file with Scala.js plugin
- `project/plugins.sbt` — adds Scala.js plugin
- `src/main/scala` — Scala source (including Scala.js code)
- `.devcontainer/` — Codespaces configuration

## References

- [Scala.js Documentation](https://www.scala-js.org/doc/)
- [Scala 3 Documentation](https://docs.scala-lang.org/scala3/)
- [sbt Documentation](https://www.scala-sbt.org/documentation.html)