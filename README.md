# Scala 3 + sbt + Scala.js Example for GitHub Codespaces

## Features

- Scala 3
- sbt (build tool)
- Scala.js support
- Ready-to-use in GitHub Codespaces

## Usage

1. **Open in GitHub Codespaces**  
   Click the green "Code" button in GitHub, then "Open with Codespaces".

2. **Use VS Code Tasks** (Recommended)  
   Access common sbt operations through VS Code:
   - Press `Ctrl+Shift+P` (or `Cmd+Shift+P` on Mac) to open Command Palette
   - Type "Tasks: Run Task" and select it
   - Choose from available tasks:
     - **sbt: compile** - Compile Scala sources
     - **sbt: run** - Run the main Scala application
     - **sbt: test** - Run all tests
     - **sbt: clean** - Clean compiled files and build artifacts
     - **sbt: fastLinkJS** - Build Scala.js output (development mode)
     - **sbt: fullLinkJS** - Build optimized Scala.js output (production mode)
     - **sbt: console** - Start Scala REPL console
     - **sbt: reload** - Reload sbt build configuration
     - **sbt: ~compile** - Watch mode: automatically recompile on file changes
     - **sbt: ~fastLinkJS** - Watch mode: automatically rebuild Scala.js on file changes

3. **Run Scala code manually (JVM):**
   ```
   sbt run
   ```

4. **Build Scala.js output manually:**
   ```
   sbt fastLinkJS
   ```
   Output will be in `target/scala-3.3.3/scalajs-example-fastopt/main.js`.

5. **Edit and develop!**  
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