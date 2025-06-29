FROM mcr.microsoft.com/devcontainers/java:0-17

# Install sbt
RUN curl -L -o /tmp/sbt.tgz https://github.com/sbt/sbt/releases/download/v1.9.9/sbt-1.9.9.tgz \
    && mkdir /usr/local/sbt \
    && tar -xzf /tmp/sbt.tgz -C /usr/local/sbt --strip-components=1 \
    && ln -s /usr/local/sbt/bin/sbt /usr/local/bin/sbt

# Install Node.js (needed for Scala.js)
RUN apt-get update && apt-get install -y nodejs npm

# Clean up
RUN rm -rf /var/lib/apt/lists/* /tmp/sbt.tgz