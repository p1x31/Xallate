# Use the AWS Elastic Beanstalk Glassfish image
FROM        amazon/aws-eb-glassfish:4.1-jdk8-onbuild-3.5.1

# Exposes port 8080
EXPOSE      8080 4848 8181

# Install Datasource dependencies
RUN         curl -L -o /tmp/connectorj.zip https://server/path/connectorj.zip && \
            unzip /tmp/connectorj.zip -d /tmp && \
            cp /tmp/connectorj/mysql-connector-java-5.1.36-bin.jar /usr/local/glassfish4/glassfish/domains/domain1/lib/ && \
            mv /var/app/WEB-INF/classes/domain.xml /usr/local/glassfish4/glassfish/domains/domain1/config/